package br.com.piovezandev.springlangchain.service;

import dev.langchain4j.service.SystemMessage;
import dev.langchain4j.service.spring.AiService;

@AiService
public interface AssistantService {

    @SystemMessage("You are a polite assistant")
    String chat(String userMessage);
}