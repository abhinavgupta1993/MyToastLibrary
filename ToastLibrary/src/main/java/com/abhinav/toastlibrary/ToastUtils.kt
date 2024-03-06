package com.abhinav.toastlibrary

import android.content.Context
import android.widget.Toast

data class GetMessage(var context: Context, var msg: String)

fun GetMessage.generateToast() {
    return Toast.makeText(context,msg,Toast.LENGTH_SHORT).show()
}