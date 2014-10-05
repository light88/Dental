import com.dental.domain.Role

class BootStrap {

    def authService

    def init = { servletContext ->

        def roleUser = new Role(authority: "ROLE_USER")
        roleUser.save()

//        def sportsman = new User(username: 'vova.rudyk@gmail.com', password: '123456',
//                profile: new Profile(firstname : 'Vova', lastname : 'Rudyk', phone: '0631788565',
//                profileType: profileTypeService.getSportsmanType()))
//        sportsman.save(flush: true)

//        def admin = new User(username: 'admin@gmail.com', password: '123456',
//                profile: new Profile(firstname : 'admin', lastname : 'admin_lastnae', phone: '11111111111',
//                profileType: profileTypeService.getSportsmanType()))
//        admin.save(flush: true)

//        def trainer = new User(username: 'trainer@gmail.com', password: '123456',
//                profile: new Profile(firstname : 'trainer', lastname : 'trainer_lastnae', phone: '555555555',
//                profileType: profileTypeService.getTrainerType()))
//        trainer.save(flush: true)

//        UserRole.create(sportsman, roleUser)
//        UserRole.create(admin, roleAdmin)
//        UserRole.create(trainer, roleTrainer)


        def p1 = [phone: '00000000', username: 'user@gmail.com', lastname: 'UserLast', firstname: 'UserFirst', patronimic: 'qqqqq', password: '123456', gender : true, dateOfBirth : new Date()]

//        authService.signup(p1)

        def p2 = [phone: '00000000', lastname: 'TrainerLast', firstname: 'TrainerFirst', patronimic: 'qqqqq',
        gender : true, dateOfBirth : new Date()
        ]

//        authService.signup(p2)


    }
    def destroy = {
    }
}
