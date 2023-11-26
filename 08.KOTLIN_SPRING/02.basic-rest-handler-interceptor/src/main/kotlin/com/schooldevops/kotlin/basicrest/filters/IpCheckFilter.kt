package com.schooldevops.kotlin.basicrest.filters

import jakarta.servlet.Filter
import jakarta.servlet.FilterChain
import jakarta.servlet.ServletRequest
import jakarta.servlet.ServletResponse
import jakarta.servlet.http.HttpServletRequest
import org.springframework.core.annotation.Order
import org.springframework.stereotype.Component

@Component
@Order(1)
class IpCheckFilter: Filter {

    private val HEADERS_TO_TRY = arrayOf(
        "X-Forwarded-For",
        "Proxy-Client-IP",
        "WL-Proxy-Client-IP",
        "HTTP_X_FORWARDED_FOR",
        "HTTP_X_FORWARDED",
        "HTTP_X_CLUSTER_CLIENT_IP",
        "HTTP_CLIENT_IP",
        "HTTP_FORWARDED_FOR",
        "HTTP_FORWARDED",
        "HTTP_VIA",
        "REMOTE_ADDR"
    )

    var allowdIps = setOf("127.0.0.1", "192.168.0.1")

    override fun doFilter(request: ServletRequest?, response: ServletResponse?, chain: FilterChain?) {

        val req = request as HttpServletRequest
        var allowedIp: Boolean = false
        for(header: String in HEADERS_TO_TRY) {
            val ip = request.getHeader(header)
            if (ip != null && ip.length != 0 && !"unknown".equals(ip.lowercase())) {
                if (allowdIps.contains(ip)) {
                    allowedIp = true
                    break
                }
            }
        }

//        if (allowedIp == false) {
//            return
//        }

        chain!!.doFilter(request, response)

        println("-----------------------------------")
    }
}