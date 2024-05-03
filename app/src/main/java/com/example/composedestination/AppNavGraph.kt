package com.example.composedestination

import com.ramcosta.composedestinations.annotation.NavGraph
import com.ramcosta.composedestinations.annotation.RootGraph

@NavGraph<RootGraph>(route = "login_route")
annotation class LoginNavGraph

@NavGraph<RootGraph>(route = "home_route")
annotation class HomeNavGraph