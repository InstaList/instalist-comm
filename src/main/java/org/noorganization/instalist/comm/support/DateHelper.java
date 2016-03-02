/*
 * Copyright 2016 Tino Siegmund, Michael Wodniok
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.noorganization.instalist.comm.support;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Deprecated
public class DateHelper {

    public static final String FORMAT = "yyyy-MM-dd'T'HH:mm:ss.SSSXXX";

    @Deprecated
    public static Date parseDate(String _dateString) {
        SimpleDateFormat parser = new SimpleDateFormat(FORMAT);
        try {
            return parser.parse(_dateString);
        } catch (ParseException _e) {
            return null;
        }
    }

    @Deprecated
    public static String writeDate(Date _date) {
        SimpleDateFormat parser = new SimpleDateFormat(FORMAT);
        return parser.format(_date);
    }
}
