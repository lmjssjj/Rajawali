/**
 * Copyright 2013 Dennis Ippel
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package org.rajawali3d.textures;


import android.content.Context;
import android.support.annotation.NonNull;
import org.rajawali3d.textures.annotation.Type;

public class Texture extends SingleTexture {
	public Texture(Texture other)
	{
		super(other);
	}

	public Texture(String textureName)
	{
		super(Type.DIFFUSE, textureName);
	}

	public Texture(String textureName, @NonNull Context context, int resourceId)
	{
		super(Type.DIFFUSE, textureName);
		setResourceId(context, resourceId);
	}

	public Texture(String textureName, TextureDataReference textureData)
	{
		super(Type.DIFFUSE, textureName, textureData);
	}

	/*public Texture(String textureName, TextureAtlas atlas)
	{
		super(TextureType.DIFFUSE, textureName, atlas.getTileNamed(textureName).getPage());
	}*/

	public Texture(String textureName, CompressedTexture compressedTexture)
	{
		super(Type.DIFFUSE, textureName, compressedTexture);
	}

	public Texture clone() {
		return new Texture(this);
	}
}
