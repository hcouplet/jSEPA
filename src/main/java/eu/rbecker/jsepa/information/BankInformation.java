/*
 * The MIT License
 *
 * Copyright 2017 Robert Becker <robert at rbecker.eu>.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package eu.rbecker.jsepa.information;

import java.io.Serializable;

/**
 *
 * @author Robert Becker <robert at rbecker.eu>
 */
public class BankInformation implements Serializable {

    private static final long serialVersionUID = 1L;

    private final String name;

    private final String shortName;

    private final String bankCode;

    private final String bic;

    public BankInformation(String name, String shortName, String bankCode, String bic) {
        this.name = name;
        this.bankCode = bankCode;
        this.bic = bic;
        this.shortName = shortName;
    }

    public String getBic() {
        return bic;
    }

    public String getName() {
        return name;
    }

    public String getBankCode() {
        return bankCode;
    }

    public String getShortName() {
        return shortName;
    }
}
