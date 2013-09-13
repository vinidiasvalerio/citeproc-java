// Copyright 2013 Michel Kraemer
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package de.undercouch.citeproc.script;

import java.io.Reader;

/**
 * Executes JavaScript scripts
 * @author Michel Kraemer
 */
public interface ScriptRunner {
	/**
	 * Sets a key/value pair in the runner's global scope
	 * @param key the key
	 * @param value the value
	 */
	void put(String key, Object value);
	
	/**
	 * Executes the given code
	 * @param code the code
	 * @return the return value from the executed script
	 * @throws ScriptRunnerException if the given code could not be executed
	 */
	Object eval(String code) throws ScriptRunnerException;
	
	/**
	 * Executes a script provided by a given reader
	 * @param reader the reader
	 * @return the return value from the executed script
	 * @throws ScriptRunnerException if the script could not be executed
	 */
	Object eval(Reader reader) throws ScriptRunnerException;
}