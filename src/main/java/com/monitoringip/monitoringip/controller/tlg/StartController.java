package com.monitoringip.monitoringip.controller.tlg;

import org.springframework.beans.factory.annotation.Autowired;
import org.telegram.telegrambots.meta.api.methods.BotApiMethod;
import org.telegram.telegrambots.meta.api.methods.send.SendInvoice;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.methods.updatingmessages.EditMessageText;
import org.telegram.telegrambots.meta.api.objects.Update;

import java.util.Arrays;
import java.util.List;

@BotController
public class StartController {
    @Autowired
    private Filter shopMenu;

    @Autowired
    private PayTokenService payTokenService;

    @Autowired
    private ItemService itemService;

    @BotRequestMapping("/shop")
    public SendMessage generateInitMenu(Update update) {
        return  new SendMessage()
                .setChatId(update.getMessage().getChatId().toString())
                .setText("Товары моего магазинчика!")
                .setReplyMarkup(shopMenu.getSubMenu(0L, 4L, 1L)); // <--
    }

    @BotRequestMapping(value = "/buyItem", method = BotRequestMethod.EDIT)
    public List<BotApiMethod> bayItem(Update update) {
        ....................
        Item item = itemService.findById(id); // <--

        return Arrays.asList(new EditMessageText()
                        .setChatId(update.getMessage().getChatId())
                        .setMessageId(update.getMessage().getMessageId())
                        .setText("Подтвердите ваш выбор, в форме ниже"),

                new SendInvoice()
                        .setChatId(Integer.parseInt(update.getMessage().getChatId().toString()))
                        .setDescription(item.getDescription())
                        .setTitle(item.getName())
                        .setProviderToken(payTokenService.getPayToken())
                        ........................
                        .setPrices(item.getPrice())
        );
    }

}
