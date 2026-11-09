package com.ute.quanlychitieu_2415053122133

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

    @Parcelize
    data class ChiTieu(
        val tenKhoan: String,
        val soTien: Long,
        val loai: String
    ) : Parcelable {
}