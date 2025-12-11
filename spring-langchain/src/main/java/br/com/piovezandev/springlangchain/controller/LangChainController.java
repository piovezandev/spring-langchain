package br.com.piovezandev.springlangchain.controller;

import br.com.piovezandev.springlangchain.service.AssistantService;
import dev.langchain4j.model.chat.ChatLanguageModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class LangChainController {

    @Autowired
    private ChatLanguageModel chatLanguageModel;

    @Autowired
    private AssistantService assistant;

    @PostMapping("/chat-bot")
    public String chatBot(@RequestBody String message) {
        return chatLanguageModel.generate(message);
    }

    @PostMapping("/assistant")
    public String assistant(@RequestBody String message) {
        return assistant.chat(message);
    }

}