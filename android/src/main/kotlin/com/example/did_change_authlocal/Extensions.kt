package com.example.did_change_authlocal

import android.util.Base64
import java.security.PublicKey

fun PublicKey.toBase64() = String(encoded.encodeBase64())

fun ByteArray.encodeBase64(): ByteArray = Base64.encode(this, Base64.DEFAULT)