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

package de.topobyte.jsoup.bootstrap3.components.listgroup;

import de.topobyte.jsoup.bootstrap3.components.ContextualType;
import de.topobyte.jsoup.components.ListItem;

public class ListGroupItem extends ListItem
{

	public ListGroupItem setContext(ContextualType type)
	{
		ContextualLists.setContext(this, type);
		return this;
	}

	public ListGroupItem setActive()
	{
		addClass("active");
		return this;
	}

	public ListGroupItem setDisabled()
	{
		addClass("disabled");
		return this;
	}

}
