package com.concourseyamlplugin;

import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class ConcoursePipelineFileType extends LanguageFileType{
  public static final ConcoursePipelineFileType INSTANCE = new ConcoursePipelineFileType();

  public ConcoursePipelineFileType() {
    super(ConcourseYamlLanguage.INSTANCE);
  }

  @NotNull
  @Override
  public String getName() {
    return "Concourse Pipeline YAML";
  }

  @NotNull
  @Override
  public String getDescription() {
    return "A yaml file with Concourse Jobs and/or Resources";
  }

  @NotNull
  @Override
  public String getDefaultExtension() {
    return "simple";
  }

  @Nullable
  @Override
  public Icon getIcon() {
    return SimpleIcons.FILE;
  }
}
