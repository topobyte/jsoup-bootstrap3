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

package de.topobyte.jsoup.bootstrap3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.apache.commons.io.IOUtils;

import de.topobyte.melon.resources.Resources;

public class TestBootstrap3
{

	public static final Path DIR = Paths.get("/tmp/jsoup-bootstrap3");

	public static void main(String[] args) throws IOException
	{
		Files.createDirectories(DIR);

		IOUtils.copy(Resources.stream("image.svg"),
				Files.newOutputStream(DIR.resolve("image.svg")));

		OverviewGenerator overviewGenerator = new OverviewGenerator();
		overviewGenerator.generate();

		FormsGenerator formsGenerator = new FormsGenerator();
		formsGenerator.generate();

		ListGroupsGenerator listGroupsGenerator = new ListGroupsGenerator();
		listGroupsGenerator.generate();
	}

}
