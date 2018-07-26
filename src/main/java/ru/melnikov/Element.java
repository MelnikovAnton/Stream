package ru.melnikov;

import java.util.HashMap;

public   class Element{
    private String ext;
    private String type;

    private static final HashMap<String,String> regions;
    static {
        regions = new HashMap<>();
        regions.put("R22","УФПС Алтайского края");
        regions.put("R28","УФПС Амурской области");
        regions.put("R29","УФПС Архангельской области");
        regions.put("R30","УФПС Астраханской области");
        regions.put("R31","УФПС Белгородской области");
        regions.put("R32","УФПС Брянской области");
        regions.put("R33","УФПС Владимирской области");
        regions.put("R34","УФПС Волгоградской области");
        regions.put("R35","УФПС Вологодской области");
        regions.put("R36","УФПС Воронежской области");
        regions.put("R77","УФПС г. Москвы");
        regions.put("R78","УФПС г. Санкт-Петербурга и Ленинградской области");
        regions.put("R79","УФПС Еврейской авт. области");
        regions.put("R75","УФПС Забайкальского края");
        regions.put("R37","УФПС Ивановской области");
        regions.put("R38","УФПС Иркутской области");
        regions.put("R07","УФПС Кабардино-Балкарской республики");
        regions.put("R39","УФПС Калининградской области");
        regions.put("R40","УФПС Калужской области");
        regions.put("R41","УФПС Камчатской области");
        regions.put("R09","УФПС Карачаево-Черкесской республики");
        regions.put("R42","УФПС Кемеровской области");
        regions.put("R43","УФПС Кировской области");
        regions.put("R44","УФПС Костромской области");
        regions.put("R23","УФПС Краснодарского края");
        regions.put("R24","УФПС Красноярского края");
        regions.put("R45","УФПС Курганской области");
        regions.put("R46","УФПС Курской области");
        regions.put("R48","УФПС Липецкой области");
        regions.put("R49","УФПС Магаданской области");
        regions.put("R50","УФПС Московской области");
        regions.put("R51","УФПС Мурманской области");
        regions.put("R83","УФПС Ненецкого АО");
        regions.put("R52","УФПС Нижегородской области");
        regions.put("R53","УФПС Новгородской области");
        regions.put("R54","УФПС Новосибирской области");
        regions.put("R55","УФПС Омской области");
        regions.put("R56","УФПС Оренбургской области");
        regions.put("R57","УФПС Орловской области");
        regions.put("R58","УФПС Пензенской области");
        regions.put("R59","УФПС Пермского края");
        regions.put("R25","УФПС Приморского края");
        regions.put("R60","УФПС Псковской области");
        regions.put("R01","УФПС Республики Адыгея");
        regions.put("R04","УФПС Республики Алтай");
        regions.put("R02","УФПС Республики Башкортостан");
        regions.put("R03","УФПС Республики Бурятия");
        regions.put("R05","УФПС Республики Дагестан");
        regions.put("R06","УФПС Республики Ингушетия");
        regions.put("R08","УФПС Республики Калмыкия");
        regions.put("R10","УФПС Республики Карелия");
        regions.put("R11","УФПС Республики Коми");
        regions.put("R12","УФПС Республики Марий Эл");
        regions.put("R13","УФПС Республики Мордовия");
        regions.put("R14","УФПС Республики Саха (Якутия)");
        regions.put("R15","УФПС Республики Северная Осетия-Алания");
        regions.put("R17","УФПС Республики Тыва");
        regions.put("R19","УФПС Республики Хакасия");
        regions.put("R61","УФПС Ростовской области");
        regions.put("R62","УФПС Рязанской области");
        regions.put("R63","УФПС Самарской области");
        regions.put("R64","УФПС Саратовской области");
        regions.put("R65","УФПС Сахалинской области");
        regions.put("R96","УФПС Свердловской области");
        regions.put("R67","УФПС Смоленской области");
        regions.put("R26","УФПС Ставропольского края");
        regions.put("R68","УФПС Тамбовской области");
        regions.put("R16","УФПС Татарстан почтасы");
        regions.put("R69","УФПС Тверской области");
        regions.put("R70","УФПС Томской области");
        regions.put("R71","УФПС Тульской области");
        regions.put("R72","УФПС Тюменской области");
        regions.put("R18","УФПС Удмуртской республики");
        regions.put("R73","УФПС Ульяновской области");
        regions.put("R27","УФПС Хабаровского края");
        regions.put("R86","УФПС Ханты-Мансийского АО");
        regions.put("R74","УФПС Челябинской области");
        regions.put("R95","УФПС Чеченской республики");
        regions.put("R21","УФПС Чувашской республики");
        regions.put("R87","УФПС Чукотского АО");
        regions.put("R89","УФПС Ямало-Ненецкого АО");
        regions.put("R76","УФПС Ярославской области");
    }

    public static String getRegionName(String code){
        return regions.get(code);
    }

    public Element(String str){
        String[] sArr = str.split(";");
        setExt(sArr[0].trim());
        setType(sArr[1].trim());
    }

    @Override
    public String toString() {
        return ext.concat(",").concat(type).concat("\n");
    }

    public String getExt() {
        return ext;
    }

    public void setExt(String ext) {
        this.ext = ext;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}