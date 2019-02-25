package usrt.technospace.controllers

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController
import usrt.technospace.models.actions.Action
import usrt.technospace.repository.ActionRepository
import javax.validation.Valid

@RestController("/actions")
class ActionsController {

    @Autowired
    lateinit var actionRepository: ActionRepository

    @GetMapping
    fun getActiveActions(): Array<Action> {
        return actionRepository.getActiveActions()
    }

    @GetMapping("/{id}")
    fun getAction(@PathVariable id: Long): Action {
        return actionRepository.getOne(id)
    }

    @PostMapping
    fun addAction(@Valid action: Action): Action {
        return actionRepository.save(action)
    }
}