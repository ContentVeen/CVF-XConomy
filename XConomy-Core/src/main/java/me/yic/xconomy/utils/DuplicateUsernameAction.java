/*
 *  This file (DuplicateUsernameAction.java) is a part of project XConomy
 *  Copyright (C) YiC and contributors
 *
 *  This program is free software: you can redistribute it and/or modify it
 *  under the terms of the GNU General Public License as published by the
 *  Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful, but
 *  WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
 *  or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 *  for more details.
 *
 *  You should have received a copy of the GNU General Public License along
 *  with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 */
package me.yic.xconomy.utils;

public enum DuplicateUsernameAction {
    /**
     * Log an error and kick the connecting player (default behaviour).
     */
    KICK,

    /**
     * Remove the username from the old UUID entry and allow the new player to
     * proceed. The old UUID record keeps its balance but gets a placeholder name
     * (the UUID string) so it no longer conflicts.
     */
    REPLACE,

    /**
     * Remove the username from the old UUID entry, then query the Mojang API to
     * find the old UUID's current username and update the old record with it.
     * Falls back to REPLACE behaviour when the API is unreachable.
     */
    MOJANG
}
