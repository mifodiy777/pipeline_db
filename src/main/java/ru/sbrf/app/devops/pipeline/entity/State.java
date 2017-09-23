package ru.sbrf.app.devops.pipeline.entity;

/**
 * Список состояний сборки
 * Created by Tom on 23.09.2017.
 */
public enum State {

    BUILD, // Сборка только собрана
    BARRIER_OK, // Сборка успешно прошла барьер
    BARRIER_FAIL, // Сборка не успешно прошла барьер
    MSV_DEPLOY, // Сборка установлена на МСВ
    IFT_DEPLOY; // Сборка установленна на ИФТ


}
