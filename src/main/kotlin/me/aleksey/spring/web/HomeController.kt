package me.aleksey.spring.web

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/")
class HomeController {

    @GetMapping
    fun home() = "Hello my new user!"
}
