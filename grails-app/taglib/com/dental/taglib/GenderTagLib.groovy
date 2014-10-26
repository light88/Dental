package com.dental.taglib

class GenderTagLib {
    static defaultEncodeAs = [taglib:'html']
    //static encodeAsForTags = [tagName: [taglib:'html'], otherTagName: [taglib:'none']]

    def gender = { attr, body ->
        def g = attr.gender == 1 ? 'Male' : 'Female'
        out << g
    }
}
