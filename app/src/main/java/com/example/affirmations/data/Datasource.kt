package com.example.affirmations.data

import com.example.affirmations.R
import com.example.affirmations.model.Affirmation

class Datasource {

    fun loadAffirmations(): List<Affirmation> {
        return listOf<Affirmation>(
            Affirmation(R.string.month1),
            Affirmation(R.string.month2),
            Affirmation(R.string.month3),
            Affirmation(R.string.month4),
            Affirmation(R.string.month5),
            Affirmation(R.string.month6),
            Affirmation(R.string.month7),
            Affirmation(R.string.month8),
            Affirmation(R.string.month9),
            Affirmation(R.string.month10),
            Affirmation(R.string.month11),
            Affirmation(R.string.month12)

        )
    }
}