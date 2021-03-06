/* Copyright (c) 2009 Christopher Wellons <mosquitopsu@gmail.com>
 *
 * Permission to use, copy, modify, and distribute this software for
 * any purpose with or without fee is hereby granted, provided that
 * the above copyright notice and this permission notice appear in all
 * copies.
 *
 * THE SOFTWARE IS PROVIDED "AS IS" AND THE AUTHOR DISCLAIMS ALL
 * WARRANTIES WITH REGARD TO THIS SOFTWARE INCLUDING ALL IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS. IN NO EVENT SHALL THE
 * AUTHOR BE LIABLE FOR ANY SPECIAL, DIRECT, INDIRECT, OR
 * CONSEQUENTIAL DAMAGES OR ANY DAMAGES WHATSOEVER RESULTING FROM LOSS
 * OF USE, DATA OR PROFITS, WHETHER IN AN ACTION OF CONTRACT,
 * NEGLIGENCE OR OTHER TORTIOUS ACTION, ARISING OUT OF OR IN
 * CONNECTION WITH THE USE OR PERFORMANCE OF THIS SOFTWARE.
 */
package com.nullprogram.gol;

import java.awt.Dimension;

import javax.swing.JApplet;

public class LifeApplet extends JApplet {

    private static final long serialVersionUID = 7359156116065111805L;
    private static final int cellSize = 5;

    private Board board;

    public void init() {
        Dimension size = getSize();
        board = new Board(cellSize, size.width / cellSize,
                          size.height / cellSize, new BasicCell());
        add(board);
    }

    public void start() {
        board.start();
    }

    public void stop() {
        board.stop();
    }

    public void destroy() {
        stop();
    }
}
