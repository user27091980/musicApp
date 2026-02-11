package com.example.musicapp.navigation

object ObjRoutes {
    const val SPLASH = "SplashRoute"
    const val LOGINREG = "LoginRegRoute/{id}"
    fun loginReg(id: String) = "LoginRegRoute/$id"
    const val LOGIN = "LoginRoute/{id}"
    fun login(id: String) = "LoginRoute/$id"
    const val REGISTER="RegisterRoute/{id}"
    fun register(id: String) = "RegisterRoute/$id"

    const val MAINSCREEN = "MainScreenRoute/{id}"
    fun mainScreen(id: String) = "MainScreenRoute/$id"

    const val AE="BandAeRoute/{id}"
    fun bandAe(id: String) = "BandAeRoute/$id"

    const val BOC="BandBocRoute/{id}"
    fun bandBoc(id: String) = "BandBocRoute/$id"

    const val APHX="BandAphxRoute/{id}"
    fun bandAphx(id: String) = "BandAphxRoute/$id"

    const val KYUSS="BandKyussRoute/{id}"
    fun bandKyuss(id: String) = "BandKyussRoute/$id"

    const val TOOL="BandToolRoute/{id}"
    fun bandTool(id: String) = "BandToolRoute/$id"

    const val INFOUSER="UserInfoRoute/{id}"
    fun infoUser(id: String) = "UserInfoRoute/$id"
    const val SETTINGS="SettingsRoute/{id}"
    fun SettingsPage(id: String) = "SettingsRoute/$id"


}