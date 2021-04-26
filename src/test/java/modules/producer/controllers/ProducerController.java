package modules.producer.controllers;

import modules.producer.services.ProducerService;
import org.junit.Test;

public class ProducerController {
    private final ProducerService producerService;

    public ProducerController() {
        producerService = new ProducerService();
    }

    @Test
    public void producerListSuccessCase(){
        producerService.getProducerList();
    }
}
