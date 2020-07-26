// Copyright 2020 Sebastian Kuerten
//
// This file is part of jsoup-bootstrap3.
//
// jsoup-bootstrap3 is free software: you can redistribute it and/or modify
// it under the terms of the GNU Lesser General Public License as published by
// the Free Software Foundation, either version 3 of the License, or
// (at your option) any later version.
//
// jsoup-bootstrap3 is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
// GNU Lesser General Public License for more details.
//
// You should have received a copy of the GNU Lesser General Public License
// along with jsoup-bootstrap3. If not, see <http://www.gnu.org/licenses/>.

package de.topobyte.jsoup.bootstrap3.components;

import de.topobyte.jsoup.components.Img;

public class ResponsiveImage extends Img
{

	public ResponsiveImage()
	{
		super();
		init();
	}

	public ResponsiveImage(String src)
	{
		super(src);
		init();
	}

	public ResponsiveImage(String src, String alt)
	{
		super(src, alt);
		init();
	}

	private void init()
	{
		addClass("img-responsive");
	}

}
