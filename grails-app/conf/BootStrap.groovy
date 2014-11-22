import com.dental.domain.Currency
import com.dental.domain.Notify
import com.dental.domain.Role

class BootStrap {

    def authService

    def init = { servletContext ->


        def roleUser = new Role(authority: "ROLE_USER")
        roleUser.save()

        def roleDentist = new Role(authority: "ROLE_DENTIST")
        roleDentist.save()


        def currencyUAH = new Currency(value: 'UAH')
        currencyUAH.save()
        def currencyUSD = new Currency(value: 'USD')
        currencyUSD.save()
        def currencyEUR = new Currency(value: 'EUR')
        currencyEUR.save()

//
//        def p1 = [phone: '00000000', username: 'user@gmail.com', lastname: 'UserLast', firstname: 'UserFirst', patronimic: 'qqqqq', password: '123456', gender : true, dateOfBirth : new Date()]
//
////        authService.signup(p1)
//
//        def p2 = [phone: '00000000', lastname: 'TrainerLast', firstname: 'TrainerFirst', patronimic: 'qqqqq',
//        gender : true, dateOfBirth : new Date()
//        ]

//        authService.signup(p2)


    }
    def destroy = {
    }
}
