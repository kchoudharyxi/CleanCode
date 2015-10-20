// Modified or written by Object Mentor, Inc. for inclusion with FitNesse.
// Copyright (c) 2002 Cunningham & Cunningham, Inc.
// Released under the terms of the GNU General Public License version 2 or later.
package fit.exception;

public class NoDefaultConstructorFixtureException extends FixtureException
{
  public NoDefaultConstructorFixtureException(String fixtureName)
  {
    super("Class {0} has no default constructor.", fixtureName);
  }
}