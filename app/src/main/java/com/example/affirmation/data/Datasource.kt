 package com.example.affirmation.data

import com.example.affirmation.R
import com.example.affirmation.model.Affirmation


class Datasource {
    fun loadAffirmations(): List<Affirmation> {
        return listOf<Affirmation>(
                Affirmation(R.string.affirmation1, R.drawable.img_20210803_wa0001),
                Affirmation(R.string.affirmation2, R.drawable.nduva_3),
                Affirmation(R.string.affirmation3, R.drawable.img_20210803_wa0002),
                Affirmation(R.string.affirmation4, R.drawable.img_20210803_wa0003),
                Affirmation(R.string.affirmation5, R.drawable.img_20210803_wa0013),
                Affirmation(R.string.affirmation6, R.drawable.img_20210803_wa0015),
                Affirmation(R.string.affirmation7, R.drawable.img_20210803_wa0020),
                Affirmation(R.string.affirmation8, R.drawable.img_20210803_wa0023),
                Affirmation(R.string.affirmation9, R.drawable.img_20210803_wa0024),
                Affirmation(R.string.affirmation10, R.drawable._54741114770_status_604ebc3610044648b04a24cddc56b64f),
                Affirmation(R.string.affirmation11, R.drawable._54746778977_status_8b7d2ce7f81d4d69ba45cdab3dc9342e),
                Affirmation(R.string.affirmation12, R.drawable.image2)

        )
    }
}