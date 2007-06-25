/*
 * Portions Copyright 1996-2007 Sun Microsystems, Inc.  All Rights Reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  Sun designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Sun in the LICENSE file that accompanied this code.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Sun Microsystems, Inc., 4150 Network Circle, Santa Clara,
 * CA 95054 USA or visit www.sun.com if you need additional information or
 * have any questions.
 */

/*
 * (C) Copyright Taligent, Inc. 1996, 1997 - All Rights Reserved
 * (C) Copyright IBM Corp. 1996 - 1998 - All Rights Reserved
 *
 * The original version of this source code and documentation
 * is copyrighted and owned by Taligent, Inc., a wholly-owned
 * subsidiary of IBM. These materials are provided under terms
 * of a License Agreement between Taligent and Sun. This technology
 * is protected by multiple US and International patents.
 *
 * This notice and attribution to Taligent may not be removed.
 * Taligent is a registered trademark of Taligent, Inc.
 *
 */

package sun.util.resources;

public final class TimeZoneNames_en_CA extends TimeZoneNamesBundle {

    protected final Object[][] getContents() {
        return new Object[][] {
	    {"PST", new String[] {/*--America/Los_Angeles--*/ "Pacific Standard Time", "PST",
				  "Pacific Daylight Time", "PDT" /*San Francisco*/}},
	    {"MST", new String[] {/*--America/Denver--*/ "Mountain Standard Time", "MST",
				  "Mountain Daylight Time", "MDT" /*Denver*/}},
	    {"PNT", new String[] {/*--America/Phoenix--*/ "Mountain Standard Time", "MST",
				  "Mountain Standard Time", "MST" /*Phoenix*/}},
	    {"CST", new String[] {/*--America/Chicago--*/ "Central Standard Time", "CST",
				  "Central Daylight Time", "CDT" /*Chicago*/}},
	    {"EST", new String[] {/*--America/New_York--*/ "Eastern Standard Time", "EST",
				  "Eastern Daylight Time", "EDT" /*New York*/}},
	    {"IET", new String[] {/*--America/Indianapolis--*/ "Eastern Standard Time", "EST",
				  "Eastern Standard Time", "EST" /*Indianapolis*/}},
	    {"HST", new String[] {/*--Pacific/Honolulu--*/ "Hawaii Standard Time", "HST",
				  "Hawaii Standard Time", "HST" /*Honolulu*/}},
	    {"AST", new String[] {/*--America/Anchorage--*/ "Alaska Standard Time", "AKST",
				  "Alaska Daylight Time", "AKDT" /*Anchorage*/}},
	    {"CNT", new String[] {/*--America/St_Johns--*/ "Newfoundland Standard Time",
				  "NST", "Newfoundland Daylight Time", "NDT" /*St. John's*/}},
            
	    {"America/Los_Angeles", new String[] {"Pacific Standard Time", "PST",
						  "Pacific Daylight Time", "PDT" /*San Francisco*/}},
	    {"America/Denver", new String[] {"Mountain Standard Time", "MST",
					     "Mountain Daylight Time", "MDT" /*Denver*/}},
	    {"America/Phoenix", new String[] {"Mountain Standard Time", "MST",
					      "Mountain Standard Time", "MST" /*Phoenix*/}},
	    {"America/Chicago", new String[] {"Central Standard Time", "CST",
					      "Central Daylight Time", "CDT" /*Chicago*/}},
	    {"America/New_York", new String[] {"Eastern Standard Time", "EST",
					       "Eastern Daylight Time", "EDT" /*New York*/}},
	    {"America/Indianapolis", new String[] {"Eastern Standard Time", "EST",
						   "Eastern Standard Time", "EST" /*Indianapolis*/}},
	    {"Pacific/Honolulu", new String[] {"Hawaii Standard Time", "HST",
					       "Hawaii Standard Time", "HST" /*Honolulu*/}},
	    {"America/Anchorage", new String[] {"Alaska Standard Time", "AKST",
						"Alaska Daylight Time", "AKDT" /*Anchorage*/}},
	    {"America/Halifax", new String[] {"Atlantic Standard Time", "AST",
					      "Atlantic Daylight Time", "ADT" /*Halifax*/}},
	    {"America/St_Johns", new String[] {"Newfoundland Standard Time",
					       "NST", "Newfoundland Daylight Time", "NDT" /*St. John's*/}},
        };
    }
}