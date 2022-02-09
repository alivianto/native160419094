package com.ubaya.native160419094

class Mahasiswa(var nrp:String,var name:String,var email:String, var noTelepon:Int) {
    override fun toString(): String {
        return "$nrp bernama $name memiliki email $email dan no telepon $noTelepon"
    }
}