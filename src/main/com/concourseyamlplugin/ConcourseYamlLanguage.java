package com.concourseyamlplugin;

import com.intellij.lang.Language;

public class ConcourseYamlLanguage extends Language {
  public static final ConcourseYamlLanguage INSTANCE = new ConcourseYamlLanguage();

  private ConcourseYamlLanguage() {
    super("ConcourseYaml");
  }
}
