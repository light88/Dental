package com.dental.controller

import com.dental.domain.City
import com.dental.domain.Notify
import org.springframework.security.access.annotation.Secured

@Secured('permitAll')
class AboutController {

    def index() {
        def notify = new Notify(mail: 'aaa@agmail.com', description: 'descddfs f df ', notified: true, createdOn: new Date())
        notify.save(flush: true, failOnError: true)

        render view: 'about'
    }

    def save() {
        def book = new City(params)
        if (book.save(flush: true)) {
            flash.message = message(
                    code: 'default.created.message',
                    args: [message(code: 'book.label',
                            default: 'Book'), book.id])

            redirect(action: "show", id: book.id)
        } else {
            render(view: "create"/*, model: [bookInstance: book]*/)
        }
    }
}
