package org.plovr;

import java.util.Map;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.javascript.jscomp.DiagnosticGroup;
import com.google.javascript.jscomp.DiagnosticGroups;
import com.google.javascript.jscomp.DiagnosticType;

public class PlovrDiagnosticGroups extends DiagnosticGroups {
  private final static Map<String, DiagnosticGroup> groupsByName =
    Maps.newHashMap(DiagnosticGroups.getRegisteredGroups());

  public static DiagnosticGroup registerGroup(String name,
      DiagnosticGroup group) {
    groupsByName.put(name, group);
    return group;
  }

  public static DiagnosticGroup registerGroup(String name,
      DiagnosticType ... types) {
    // For some reason, this constructor is not visible to plovr:
    //
    // DiagnosticGroup group = new DiagnosticGroup(name, types);
    //
    // Fortunately, the name field of a DiagnosticGroup is only used in its
    // toString() method, though it is a little annoying that the key in the
    // groupsByName map does not match the name of the group it is associated
    // with.
    DiagnosticGroup group = new DiagnosticGroup(types);

    groupsByName.put(name, group);
    return group;
  }

  public static DiagnosticGroup registerGroup(String name,
      DiagnosticGroup ... groups) {
    DiagnosticGroup group = new DiagnosticGroup(name, groups);
    groupsByName.put(name, group);
    return group;
  }

  public static ImmutableMap<String, DiagnosticGroup> getRegisteredGroups() {
    return ImmutableMap.copyOf(groupsByName);
  }

  public static DiagnosticGroup forName(String name) {
    return groupsByName.get(name);
  }
}
