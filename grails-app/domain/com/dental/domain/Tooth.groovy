package com.dental.domain

class Tooth {

    String description
    boolean exist
    String name
    int color

    static belongsTo = [mouth: Mouth]

    static constraints = {
        exist defaultValue: true
    }
}
