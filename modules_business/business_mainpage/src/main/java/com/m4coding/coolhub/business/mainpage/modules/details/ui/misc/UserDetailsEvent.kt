package com.m4coding.coolhub.business.mainpage.modules.details.ui.misc

/**
 * @author mochangsheng
 * @description 用户详情eventBus事件定义
 */
class UserDetailsEvent(type: Int, value: Any?) {

    companion object {
        const val TYPE_INVALID = 0x00
        const val TYPE_UPDATE = 0x01
    }

    var type: Int = type
    var value: Any? = value
}