package com.portfolio.Divyansh.Portfolio.Mapper;

import com.portfolio.Divyansh.Portfolio.Entity.Language;
import com.portfolio.Divyansh.Portfolio.DTO.LanguageDTO;

public class LanguageMapper {

    public static LanguageDTO mapToLanguageDTO(Language language) {

        LanguageDTO dto = new LanguageDTO();

        dto.setId(language.getId());
        dto.setLanguageName(language.getLanguageName());
        dto.setVersion(language.getVersion());
        dto.setOrientation(language.getOrientation());
        dto.setProficiency(language.getProficiency());
        dto.setExperience(language.getExperience());
        dto.setPackageManager(language.getPackageManager());
        dto.setDomain(language.getDomain());
        dto.setFrameworks(language.getFrameworks());
        dto.setDescription(language.getDescription());
        dto.setImage(language.getImage());

        return dto;
    }

    public static Language mapToLanguage(LanguageDTO languageDTO) {
        Language language = new Language();

        language.setId(languageDTO.getId());
        language.setLanguageName(languageDTO.getLanguageName());
        language.setVersion(languageDTO.getVersion());
        language.setOrientation(languageDTO.getOrientation());
        language.setProficiency(languageDTO.getProficiency());
        language.setExperience(languageDTO.getExperience());
        language.setPackageManager(languageDTO.getPackageManager());
        language.setDomain(languageDTO.getDomain());
        language.setFrameworks(languageDTO.getFrameworks());
        language.setDescription(languageDTO.getDescription());
        language.setImage(languageDTO.getImage());

        return language;
    }
}
