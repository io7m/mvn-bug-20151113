/*
 * Copyright © 2015 <code@io7m.com> http://io7m.com
 *
 * Permission to use, copy, modify, and/or distribute this software for any
 * purpose with or without fee is hereby granted, provided that the above
 * copyright notice and this permission notice appear in all copies.
 *
 * THE SOFTWARE IS PROVIDED "AS IS" AND THE AUTHOR DISCLAIMS ALL WARRANTIES
 * WITH REGARD TO THIS SOFTWARE INCLUDING ALL IMPLIED WARRANTIES OF
 * MERCHANTABILITY AND FITNESS. IN NO EVENT SHALL THE AUTHOR BE LIABLE FOR ANY
 * SPECIAL, DIRECT, INDIRECT, OR CONSEQUENTIAL DAMAGES OR ANY DAMAGES
 * WHATSOEVER RESULTING FROM LOSS OF USE, DATA OR PROFITS, WHETHER IN AN
 * ACTION OF CONTRACT, NEGLIGENCE OR OTHER TORTIOUS ACTION, ARISING OUT OF OR
 * IN CONNECTION WITH THE USE OR PERFORMANCE OF THIS SOFTWARE.
 */

package com.io7m.jpra.maven;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;
import org.apache.maven.project.MavenProject;

import java.io.File;
import java.util.List;

// CHECKSTYLE:OFF

@Mojo(name = "generate-java", requiresProject = true)
public final class JPRACodeGeneratorMojo extends AbstractMojo
{
  @Parameter(defaultValue = "${project}") private MavenProject project;

  /**
   * The directory that will contain source files.
   */

  @Parameter(defaultValue = "${project.basedir}/src/main/jpra") private File
    sourceDirectory;

  /**
   * The directory that will contain generated Java files.
   */

  @Parameter(defaultValue = "${project.build.directory}/generated-test-sources")
  private File targetDirectory;

  /**
   * The list of packages that will be exported to Java source code.
   */

  @Parameter private List<String> packages;

  /**
   * Construct a plugin.
   */

  public JPRACodeGeneratorMojo()
  {

  }

  @Override public void execute()
    throws MojoExecutionException, MojoFailureException
  {

  }
}
