/*
 *  Copyright (C) 2010-2022 JPEXS, All rights reserved.
 * 
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3.0 of the License, or (at your option) any later version.
 * 
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library.
 */
package com.jpexs.decompiler.flash.types.sound;

import com.jpexs.decompiler.flash.SWFInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 *
 * @author JPEXS
 */
public abstract class SoundDecoder {

    public SoundFormat soundFormat;

    public SoundDecoder(SoundFormat soundFormat) {
        this.soundFormat = soundFormat;
    }

    public byte[] decode(SWFInputStream sis) throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        decode(sis, baos);
        return baos.toByteArray();
    }

    public abstract void decode(SWFInputStream sis, OutputStream os) throws IOException;
}
