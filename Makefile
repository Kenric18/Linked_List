# Makefile
#
# ADS - Algorithms and Data Structures Course
# Copyright (C) 2015-2016 Frank C Langbein <frank@langbein.org>
#
# This program is free software: you can redistribute it and/or modify
# it under the terms of the GNU General Public License as published by
# the Free Software Foundation, either version 3 of the License, or
# (at your option) any later version.
#
# This program is distributed in the hope that it will be useful,
# but WITHOUT ANY WARRANTY; without even the implied warranty of
# MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
# GNU General Public License for more details.
#
# You should have received a copy of the GNU General Public License
# along with this program.  If not, see <http://www.gnu.org/licenses/>.

# Define java compiler and flags and how to compile java files to class files
JAVA = java
JFLAGS = -g:none  -implicit:none
JC = javac
.SUFFIXES:
.SUFFIXES: .java .class
.java.class:
	$(JC) $(JFLAGS) $*.java

# Define delete command
RM = rm -f

# Default make target
.DEFAULT_GOAL := all
.PHONY: all
all: ListTest.class LinkedList.class

# Execute program for testing
.PHONY: exec
exec: all
	@echo "Running ListTest"
	@$(JAVA) ListTest

# Tests
.PHONY: test
test: all
	@test -d ../tests || (echo "Cannot find tests" >&2; exit 1)
	@ls ../tests | sort | while read T; do \
	  if [ -x "../tests/$$T" -a -f "../tests/$$T" ]; then \
	    echo "# $$T"; \
	    "../tests/$$T" || exit 1; \
	  fi; \
	done

# Cleanup files generated by compiler
.PHONY: clean
clean:
	$(RM) *.class

# Cleanup anything that can be generated
.PHONY: distclean
distclean: clean
	$(RM) test_*
