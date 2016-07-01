PACKAGES = "python2.7 python2.7-minimal"
PROVIDES = "python2.7 python2.7-minimal"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/p/python2.7/python2.7_2.7.3-6+deb7u3_armhf.deb;unpack=0;name=deb0\
	http://archive.raspbian.org/raspbian/pool/main/p/python2.7/python2.7-minimal_2.7.3-6+deb7u3_armhf.deb;unpack=0;name=deb1\
"
DEBFILENAME_python2.7 = "python2.7_2.7.3-6+deb7u3_armhf.deb"
SRC_URI[deb0.sha256sum] = "259ef6ff02d620600a5e0ed4028a3f33eddb1d1247dd14862b58b1605fbe819c"
SRC_URI[deb0.md5sum] = "a2b8cb6ec9f46eadfb8588778f9c59f9"
DEBFILENAME_python2.7-minimal = "python2.7-minimal_2.7.3-6+deb7u3_armhf.deb"
SRC_URI[deb1.sha256sum] = "f5ff3925392332d152ef6eeb1963404e08168140ce1eb49d0db651d8110ee07a"
SRC_URI[deb1.md5sum] = "48538fb49317f24a1981068d6e9daf85"

RDEPENDS_${PN} = "python2.7-minimal (= 2.7.3-6+deb7u3) mime-support libbz2-1.0 libc6 (>= 2.13-28) libdb5.1 libexpat1 (>= 2.1~beta3) libgcc1 (>= 1:4.4.0) libncursesw5 (>= 5.6+20070908) libreadline6 (>= 6.0) libsqlite3-0 (>= 3.5.9) libtinfo5"
RDEPENDS_${PN}-minimal = "libc6 (>= 2.13-28) libgcc1 (>= 1:4.1.1) libssl1.0.0 (>= 1.0.0) zlib1g (>= 1:1.2.0)"
DEPENDS = "libgcc1 libssl1.0.0 libexpat1 libncursesw5 libtinfo5 libc6 libreadline6 libsqlite3-0 libdb5.1 mime-support libbz2-1.0 zlib1g"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_${PN} = " \
	./usr/lib/python2.7/lib2to3/fixes/fix_funcattrs.py \
	./usr/lib/python2.7/bsddb/dbutils.py \
	./usr/lib/python2.7/distutils/README \
	./usr/lib/python2.7/email/quoprimime.py \
	./usr/lib/python2.7/xml/dom/domreg.py \
	./usr/lib/python2.7/lib2to3/pgen2/__init__.py \
	./usr/lib/python2.7/xml/etree/ElementPath.py \
	./usr/lib/python2.7/lib2to3/fixes/__init__.py \
	./usr/lib/python2.7/xml/etree/ElementInclude.py \
	./usr/lib/python2.7/curses/ascii.py \
	./usr/lib/python2.7/sunaudio.py \
	./usr/lib/python2.7/webbrowser.py \
	./usr/lib/python2.7/multiprocessing/util.py \
	./usr/lib/python2.7/tabnanny.py \
	./usr/lib/python2.7/netrc.py \
	./usr/lib/python2.7/encodings/cp949.py \
	./usr/lib/python2.7/lib-tk/Tkinter.py \
	./usr/lib/python2.7/httplib.py \
	./usr/lib/python2.7/distutils/text_file.py \
	./usr/lib/python2.7/sched.py \
	./usr/share/menu/python2.7 \
	./usr/lib/python2.7/distutils/command/clean.py \
	./usr/lib/python2.7/multiprocessing/dummy/connection.py \
	./usr/lib/python2.7/mhlib.py \
	./usr/lib/python2.7/lib2to3/main.py \
	./usr/lib/python2.7/email/__init__.py \
	./usr/lib/python2.7/distutils/command/install_data.py \
	./usr/lib/python2.7/Queue.py \
	./usr/lib/python2.7/plat-linux2/CDROM.py \
	./usr/lib/python2.7/lib2to3/fixes/fix_methodattrs.py \
	./usr/lib/python2.7/_pyio.py \
	./usr/bin/pdb2.7 \
	./usr/lib/python2.7/lib-dynload/_codecs_tw.so \
	./usr/lib/python2.7/xmlrpclib.py \
	./usr/lib/python2.7/compiler/pycodegen.py \
	./usr/lib/python2.7/lib2to3/PatternGrammar.txt \
	./usr/lib/python2.7/decimal.py \
	./usr/lib/python2.7/pdb.py \
	./usr/lib/python2.7/lib2to3/btm_matcher.py \
	./usr/lib/python2.7/email/base64mime.py \
	./usr/lib/python2.7/lib2to3/fixes/fix_numliterals.py \
	./usr/lib/python2.7/multiprocessing/pool.py \
	./usr/lib/python2.7/lib-dynload/parser.so \
	./usr/lib/python2.7/lib2to3/fixes/fix_raw_input.py \
	./usr/share/man/man1/pygettext2.7.1.gz \
	./usr/lib/python2.7/lib2to3/fixes/fix_xrange.py \
	./usr/lib/python2.7/lib2to3/fixes/fix_has_key.py \
	./usr/lib/python2.7/encodings/euc_kr.py \
	./usr/lib/python2.7/symbol.py \
	./usr/lib/python2.7/encodings/iso2022_jp_1.py \
	./usr/lib/python2.7/plat-linux2/IN.py \
	./usr/lib/python2.7/distutils/errors.py \
	./usr/lib/python2.7/cProfile.py \
	./usr/lib/python2.7/lib-tk/turtle.py \
	./usr/lib/python2.7/unittest/__main__.py \
	./usr/lib/python2.7/distutils/log.py \
	./usr/lib/python2.7/smtpd.py \
	./usr/lib/python2.7/compiler/syntax.py \
	./usr/lib/python2.7/nntplib.py \
	./usr/lib/python2.7/ftplib.py \
	./usr/lib/python2.7/lib2to3/fixes/fix_basestring.py \
	./usr/lib/python2.7/encodings/iso2022_jp_2.py \
	./usr/lib/python2.7/lib2to3/fixes/fix_filter.py \
	./usr/lib/python2.7/nturl2path.py \
	./usr/lib/python2.7/lib-dynload/_codecs_hk.so \
	./usr/lib/python2.7/wsgiref/headers.py \
	./usr/lib/python2.7/code.py \
	./usr/lib/python2.7/lib2to3/fixes/fix_repr.py \
	./usr/lib/python2.7/lib-dynload/_curses.so \
	./usr/lib/python2.7/distutils/versionpredicate.py \
	./usr/lib/python2.7/lib2to3/fixes/fix_urllib.py \
	./usr/lib/python2.7/whichdb.py \
	./usr/lib/python2.7/xml/dom/minidom.py \
	./usr/lib/python2.7/bsddb/dbobj.py \
	./usr/lib/python2.7/encodings/big5hkscs.py \
	./usr/lib/python2.7/xml/dom/__init__.py \
	./usr/lib/python2.7/multiprocessing/process.py \
	./usr/lib/python2.7/email/mime/nonmultipart.py \
	./usr/lib/python2.7/urlparse.py \
	./usr/lib/python2.7/lib2to3/fixes/fix_standarderror.py \
	./usr/lib/python2.7/ihooks.py \
	./usr/share/man/man1/pdb2.7.1.gz \
	./usr/lib/python2.7/colorsys.py \
	./usr/lib/python2.7/uu.py \
	./usr/lib/python2.7/lib2to3/fixes/fix_idioms.py \
	./usr/lib/python2.7/cgitb.py \
	./usr/lib/python2.7/email/_parseaddr.py \
	./usr/lib/python2.7/lib-tk/Tix.py \
	./usr/lib/python2.7/lib-dynload/resource.so \
	./usr/lib/python2.7/distutils/ccompiler.py \
	./usr/lib/python2.7/tty.py \
	./usr/lib/python2.7/lib-dynload/nis.so \
	./usr/lib/python2.7/lib2to3/fixes/fix_ne.py \
	./usr/lib/python2.7/distutils/__init__.py \
	./usr/lib/python2.7/wsgiref/simple_server.py \
	./usr/lib/python2.7/os2emxpath.py \
	./usr/lib/python2.7/dummy_thread.py \
	./usr/lib/python2.7/lib2to3/fixes/fix_future.py \
	./usr/lib/python2.7/hotshot/stones.py \
	./usr/lib/python2.7/lib-dynload/_io.so \
	./usr/bin/pygettext2.7 \
	./usr/lib/python2.7/cgi.py \
	./usr/lib/python2.7/lib-dynload/_ctypes_test.so \
	./usr/lib/python2.7/zipfile.py \
	./usr/lib/python2.7/distutils/version.py \
	./usr/lib/python2.7/shlex.py \
	./usr/lib/python2.7/lib-dynload/_codecs_kr.so \
	./usr/lib/python2.7/distutils/sysconfig.py \
	./usr/lib/python2.7/distutils/command/bdist_dumb.py \
	./usr/lib/python2.7/gettext.py \
	./usr/lib/python2.7/multifile.py \
	./usr/lib/python2.7/encodings/iso2022_jp_2004.py \
	./usr/lib/python2.7/distutils/config.py \
	./usr/lib/python2.7/hotshot/log.py \
	./usr/lib/python2.7/user.py \
	./usr/lib/python2.7/sqlite3/__init__.py \
	./usr/lib/python2.7/lib-dynload/_bsddb.so \
	./usr/bin/pydoc2.7 \
	./usr/lib/python2.7/lib-dynload/_json.so \
	./usr/lib/python2.7/lib2to3/fixes/fix_next.py \
	./usr/lib/python2.7/profile.py \
	./usr/lib/python2.7/lib-dynload/dl.so \
	./usr/lib/python2.7/pydoc_data/topics.py \
	./usr/lib/python2.7/lib2to3/fixes/fix_exec.py \
	./usr/lib/python2.7/distutils/util.py \
	./usr/lib/python2.7/lib-dynload/pyexpat.so \
	./usr/lib/python2.7/lib2to3/fixes/fix_intern.py \
	./usr/lib/python2.7/calendar.py \
	./usr/lib/python2.7/formatter.py \
	./usr/lib/python2.7/lib-dynload/_lsprof.so \
	./usr/lib/python2.7/markupbase.py \
	./usr/share/lintian/overrides/python2.7 \
	./usr/lib/python2.7/lib-dynload/_csv.so \
	./usr/lib/python2.7/toaiff.py \
	./usr/lib/python2.7/encodings/gb2312.py \
	./usr/lib/python2.7/lib2to3/fixes/fix_except.py \
	./usr/lib/python2.7/bsddb/__init__.py \
	./usr/lib/python2.7/rfc822.py \
	./usr/lib/python2.7/plat-linux2/DLFCN.py \
	./usr/lib/python2.7/lib2to3/fixes/fix_paren.py \
	./usr/lib/python2.7/distutils/msvc9compiler.py \
	./usr/lib/python2.7/lib-dynload/fpectl.so \
	./usr/lib/python2.7/distutils/cmd.py \
	./usr/lib/python2.7/lib-tk/tkFont.py \
	./usr/lib/python2.7/encodings/shift_jisx0213.py \
	./usr/share/doc/python2.7/changelog.gz \
	./usr/lib/python2.7/json/encoder.py \
	./usr/lib/python2.7/io.py \
	./usr/lib/python2.7/new.py \
	./usr/lib/python2.7/distutils/command/install.py \
	./usr/lib/python2.7/unittest/runner.py \
	./usr/lib/python2.7/test/__init__.py \
	./usr/lib/python2.7/BaseHTTPServer.py \
	./usr/lib/python2.7/multiprocessing/synchronize.py \
	./usr/lib/python2.7/pickletools.py \
	./usr/lib/python2.7/lib-dynload/_sqlite3.so \
	./usr/lib/python2.7/lib-dynload/_ctypes.so \
	./usr/lib/python2.7/lib-dynload/datetime.so \
	./usr/lib/python2.7/modulefinder.py \
	./usr/lib/python2.7/hotshot/__init__.py \
	./usr/lib/python2.7/lib-tk/Tkconstants.py \
	./usr/lib/python2.7/email/feedparser.py \
	./usr/lib/python2.7/_strptime.py \
	./usr/lib/python2.7/_LWPCookieJar.py \
	./usr/share/man/man1/pydoc2.7.1.gz \
	./usr/lib/python2.7/json/tool.py \
	./usr/lib/python2.7/xdrlib.py \
	./usr/lib/python2.7/lib2to3/fixes/fix_xreadlines.py \
	./usr/lib/python2.7/distutils/command/install_lib.py \
	./usr/lib/python2.7/lib-tk/FileDialog.py \
	./usr/lib/python2.7/compiler/visitor.py \
	./usr/lib/python2.7/distutils/archive_util.py \
	./usr/lib/python2.7/xml/sax/handler.py \
	./usr/lib/python2.7/compiler/__init__.py \
	./usr/lib/python2.7/email/header.py \
	./usr/lib/python2.7/lib2to3/PatternGrammar2.7.3.final.0.pickle \
	./usr/lib/python2.7/lib-tk/SimpleDialog.py \
	./usr/lib/python2.7/sets.py \
	./usr/lib/python2.7/encodings/johab.py \
	./usr/lib/python2.7/lib-dynload/_elementtree.so \
	./usr/share/doc/python2.7/README.Debian \
	./usr/lib/python2.7/rlcompleter.py \
	./usr/lib/python2.7/doctest.py \
	./usr/lib/python2.7/multiprocessing/reduction.py \
	./usr/lib/python2.7/__phello__.foo.py \
	./usr/lib/python2.7/email/mime/__init__.py \
	./usr/lib/python2.7/json/__init__.py \
	./usr/lib/python2.7/compiler/transformer.py \
	./usr/lib/python2.7/_threading_local.py \
	./usr/lib/python2.7/lib2to3/fixer_base.py \
	./usr/lib/python2.7/xml/__init__.py \
	./usr/lib/python2.7/lib2to3/fixes/fix_execfile.py \
	./usr/lib/python2.7/dist-packages/README \
	./usr/lib/python2.7/encodings/euc_jp.py \
	./usr/lib/python2.7/sunau.py \
	./usr/lib/python2.7/unittest/main.py \
	./usr/lib/python2.7/imputil.py \
	./usr/lib/python2.7/fpformat.py \
	./usr/lib/python2.7/urllib2.py \
	./usr/share/doc/python2.7/changelog.Debian.gz \
	./usr/lib/python2.7/lib-dynload/mmap.so \
	./usr/lib/python2.7/lib-tk/tkSimpleDialog.py \
	./usr/lib/python2.7/lib2to3/fixes/fix_apply.py \
	./usr/lib/python2.7/htmllib.py \
	./usr/lib/python2.7/dircache.py \
	./usr/lib/python2.7/lib2to3/fixes/fix_tuple_params.py \
	./usr/lib/python2.7/imghdr.py \
	./usr/lib/python2.7/difflib.py \
	./usr/lib/python2.7/multiprocessing/heap.py \
	./usr/lib/python2.7/encodings/cp950.py \
	./usr/lib/python2.7/lib2to3/btm_utils.py \
	./usr/share/man/man1/2to3-2.7.1.gz \
	./usr/lib/python2.7/curses/panel.py \
	./usr/lib/python2.7/symtable.py \
	./usr/lib/python2.7/bdb.py \
	./usr/lib/python2.7/lib2to3/__init__.py \
	./usr/lib/python2.7/compiler/future.py \
	./usr/lib/python2.7/numbers.py \
	./usr/lib/python2.7/asynchat.py \
	./usr/lib/python2.7/lib-tk/ScrolledText.py \
	./usr/lib/python2.7/lib2to3/pgen2/conv.py \
	./usr/lib/python2.7/lib-tk/ttk.py \
	./usr/lib/python2.7/compiler/misc.py \
	./usr/lib/python2.7/lib-tk/tkMessageBox.py \
	./usr/lib/python2.7/sqlite3/dbapi2.py \
	./usr/share/doc/python2.7/ACKS.gz \
	./usr/lib/python2.7/email/mime/text.py \
	./usr/lib/python2.7/mutex.py \
	./usr/lib/python2.7/lib-dynload/future_builtins.so \
	./usr/lib/python2.7/lib-dynload/_codecs_cn.so \
	./usr/lib/python2.7/xml/dom/pulldom.py \
	./usr/lib/python2.7/lib2to3/pgen2/parse.py \
	./usr/share/doc/python2.7/copyright \
	./usr/lib/python2.7/encodings/euc_jis_2004.py \
	./usr/lib/python2.7/htmlentitydefs.py \
	./usr/lib/python2.7/distutils/command/build_scripts.py \
	./usr/lib/python2.7/unittest/loader.py \
	./usr/lib/python2.7/codeop.py \
	./usr/lib/python2.7/xml/sax/xmlreader.py \
	./usr/lib/python2.7/commands.py \
	./usr/lib/python2.7/lib-dynload/imageop.so \
	./usr/lib/python2.7/asyncore.py \
	./usr/lib/python2.7/distutils/fancy_getopt.py \
	./usr/lib/python2.7/urllib.py \
	./usr/lib/python2.7/unittest/util.py \
	./usr/lib/python2.7/lib2to3/fixes/fix_zip.py \
	./usr/lib/python2.7/distutils/bcppcompiler.py \
	./usr/lib/python2.7/distutils/file_util.py \
	./usr/lib/python2.7/lib-tk/tkCommonDialog.py \
	./usr/lib/python2.7/lib-dynload/bz2.so \
	./usr/lib/python2.7/sgmllib.py \
	./usr/lib/python2.7/_MozillaCookieJar.py \
	./usr/lib/python2.7/lib-tk/tkColorChooser.py \
	./usr/lib/python2.7/lib2to3/pytree.py \
	./usr/lib/python2.7/distutils/debug.py \
	./usr/lib/python2.7/lib-dynload/_curses_panel.so \
	./usr/lib/python2.7/fileinput.py \
	./usr/lib/python2.7/tarfile.py \
	./usr/lib/python2.7/trace.py \
	./usr/lib/python2.7/encodings/gbk.py \
	./usr/lib/python2.7/wave.py \
	./usr/lib/python2.7/distutils/command/command_template \
	./usr/lib/python2.7/xml/etree/cElementTree.py \
	./usr/lib/python2.7/poplib.py \
	./usr/lib/python2.7/lib2to3/fixes/fix_map.py \
	./usr/lib/python2.7/lib2to3/fixes/fix_exitfunc.py \
	./usr/lib/python2.7/xml/sax/__init__.py \
	./usr/lib/python2.7/email/mime/base.py \
	./usr/lib/python2.7/hotshot/stats.py \
	./usr/lib/python2.7/macurl2path.py \
	./usr/lib/python2.7/distutils/spawn.py \
	./usr/lib/python2.7/encodings/gb18030.py \
	./usr/lib/python2.7/getpass.py \
	./usr/lib/python2.7/aifc.py \
	./usr/lib/python2.7/xml/sax/_exceptions.py \
	./usr/lib/python2.7/lib-dynload/_hotshot.so \
	./usr/lib/python2.7/lib-dynload/termios.so \
	./usr/lib/python2.7/cookielib.py \
	./usr/lib/python2.7/xml/dom/NodeFilter.py \
	./usr/lib/python2.7/pdb.doc \
	./usr/lib/python2.7/UserString.py \
	./usr/lib/python2.7/mailbox.py \
	./usr/lib/python2.7/lib-dynload/ossaudiodev.so \
	./usr/lib/python2.7/lib2to3/fixes/fix_dict.py \
	./usr/lib/python2.7/multiprocessing/__init__.py \
	./usr/lib/python2.7/lib2to3/fixes/fix_imports.py \
	./usr/lib/python2.7/distutils/command/bdist.py \
	./usr/lib/python2.7/anydbm.py \
	./usr/lib/python2.7/multiprocessing/dummy/__init__.py \
	./usr/lib/python2.7/encodings/bz2_codec.py \
	./usr/lib/python2.7/locale.py \
	./usr/share/applications/python2.7.desktop \
	./usr/lib/python2.7/gzip.py \
	./usr/lib/python2.7/xml/dom/expatbuilder.py \
	./usr/lib/python2.7/argparse.egg-info \
	./usr/lib/python2.7/distutils/core.py \
	./usr/lib/python2.7/lib2to3/fixes/fix_buffer.py \
	./usr/lib/python2.7/encodings/shift_jis.py \
	./usr/lib/python2.7/distutils/command/__init__.py \
	./usr/lib/python2.7/distutils/unixccompiler.py \
	./usr/lib/python2.7/json/decoder.py \
	./usr/lib/python2.7/test/test_support.py \
	./usr/lib/python2.7/lib2to3/fixes/fix_unicode.py \
	./usr/lib/python2.7/distutils/dir_util.py \
	./usr/lib/python2.7/test/regrtest.py \
	./usr/lib/python2.7/encodings/iso2022_jp_ext.py \
	./usr/lib/python2.7/statvfs.py \
	./usr/lib/python2.7/lib2to3/fixes/fix_input.py \
	./usr/lib/python2.7/lib2to3/pgen2/literals.py \
	./usr/lib/python2.7/xml/sax/saxutils.py \
	./usr/lib/python2.7/distutils/command/build_ext.py \
	./usr/lib/python2.7/dumbdbm.py \
	./usr/lib/python2.7/lib2to3/fixes/fix_long.py \
	./usr/lib/python2.7/xmllib.py \
	./usr/lib/python2.7/lib2to3/fixes/fix_isinstance.py \
	./usr/lib/python2.7/contextlib.py \
	./usr/lib/python2.7/bsddb/dbtables.py \
	./usr/lib/python2.7/lib-dynload/_sysconfigdata.py \
	./usr/lib/python2.7/lib-tk/tkFileDialog.py \
	./usr/lib/python2.7/lib-dynload/_testcapi.so \
	./usr/lib/python2.7/curses/__init__.py \
	./usr/lib/python2.7/curses/has_key.py \
	./usr/lib/python2.7/unittest/case.py \
	./usr/lib/python2.7/email/parser.py \
	./usr/lib/python2.7/sndhdr.py \
	./usr/lib/python2.7/lib2to3/fixes/fix_import.py \
	./usr/lib/python2.7/CGIHTTPServer.py \
	./usr/lib/python2.7/distutils/dist.py \
	./usr/lib/python2.7/wsgiref/__init__.py \
	./usr/lib/python2.7/plat-linux2/TYPES.py \
	./usr/lib/python2.7/distutils/emxccompiler.py \
	./usr/lib/python2.7/lib-tk/Dialog.py \
	./usr/lib/python2.7/distutils/command/install_headers.py \
	./usr/lib/python2.7/MimeWriter.py \
	./usr/lib/python2.7/filecmp.py \
	./usr/lib/python2.7/posixfile.py \
	./usr/lib/python2.7/email/generator.py \
	./usr/lib/python2.7/xml/parsers/__init__.py \
	./usr/lib/python2.7/sqlite3/dump.py \
	./usr/lib/python2.7/lib-dynload/_multibytecodec.so \
	./usr/lib/python2.7/email/mime/application.py \
	./usr/lib/python2.7/chunk.py \
	./usr/lib/python2.7/robotparser.py \
	./usr/lib/python2.7/distutils/command/install_egg_info.py \
	./usr/lib/python2.7/UserList.py \
	./usr/lib/python2.7/ntpath.py \
	./usr/lib/python2.7/lib-dynload/crypt.so \
	./usr/lib/python2.7/telnetlib.py \
	./usr/lib/python2.7/bsddb/dbrecio.py \
	./usr/lib/python2.7/distutils/command/build_clib.py \
	./usr/lib/python2.7/lib2to3/pgen2/driver.py \
	./usr/lib/python2.7/distutils/command/build.py \
	./usr/lib/python2.7/lib2to3/__main__.py \
	./usr/lib/python2.7/lib-dynload/readline.so \
	./usr/lib/python2.7/lib-dynload/_codecs_jp.so \
	./usr/lib/python2.7/email/iterators.py \
	./usr/lib/python2.7/lib2to3/Grammar.txt \
	./usr/lib/python2.7/hmac.py \
	./usr/lib/python2.7/DocXMLRPCServer.py \
	./usr/lib/python2.7/lib2to3/Grammar2.7.3.final.0.pickle \
	./usr/lib/python2.7/binhex.py \
	./usr/lib/python2.7/distutils/extension.py \
	./usr/lib/python2.7/multiprocessing/sharedctypes.py \
	./usr/lib/python2.7/lib2to3/fixes/fix_sys_exc.py \
	./usr/lib/python2.7/lib2to3/fixes/fix_renames.py \
	./usr/lib/python2.7/pstats.py \
	./usr/lib/python2.7/lib2to3/fixes/fix_metaclass.py \
	./usr/lib/python2.7/lib-dynload/linuxaudiodev.so \
	./usr/lib/python2.7/encodings/iso2022_kr.py \
	./usr/lib/python2.7/importlib/__init__.py \
	./usr/lib/python2.7/encodings/big5.py \
	./usr/lib/python2.7/distutils/msvccompiler.py \
	./usr/lib/python2.7/test/pystone.py \
	./usr/lib/python2.7/email/charset.py \
	./usr/lib/python2.7/ctypes/wintypes.py \
	./usr/lib/python2.7/bsddb/dbshelve.py \
	./usr/lib/python2.7/rexec.py \
	./usr/lib/python2.7/unittest/__init__.py \
	./usr/lib/python2.7/lib2to3/fixes/fix_throw.py \
	./usr/lib/python2.7/email/encoders.py \
	./usr/lib/python2.7/unittest/suite.py \
	./usr/lib/python2.7/antigravity.py \
	./usr/lib/python2.7/xml/dom/minicompat.py \
	./usr/lib/python2.7/lib2to3/fixes/fix_imports2.py \
	./usr/lib/python2.7/dbhash.py \
	./usr/lib/python2.7/cmd.py \
	./usr/lib/python2.7/compiler/symbols.py \
	./usr/lib/python2.7/lib-dynload/dbm.so \
	./usr/lib/python2.7/stringold.py \
	./usr/lib/python2.7/distutils/command/register.py \
	./usr/lib/python2.7/ctypes/util.py \
	./usr/lib/python2.7/this.py \
	./usr/lib/python2.7/dummy_threading.py \
	./usr/share/doc/python2.7/README.gz \
	./usr/lib/python2.7/xml/etree/ElementTree.py \
	./usr/lib/python2.7/encodings/euc_jisx0213.py \
	./usr/lib/python2.7/lib2to3/fixes/fix_callable.py \
	./usr/lib/python2.7/compiler/pyassem.py \
	./usr/lib/python2.7/quopri.py \
	./usr/lib/python2.7/wsgiref/handlers.py \
	./usr/lib/python2.7/xml/dom/xmlbuilder.py \
	./usr/lib/python2.7/lib2to3/pgen2/token.py \
	./usr/lib/python2.7/Bastion.py \
	./usr/lib/python2.7/csv.py \
	./usr/lib/python2.7/argparse.py \
	./usr/lib/python2.7/distutils/command/config.py \
	./usr/lib/python2.7/lib2to3/fixes/fix_getcwdu.py \
	./usr/lib/python2.7/imaplib.py \
	./usr/lib/python2.7/lib2to3/fixes/fix_set_literal.py \
	./usr/lib/python2.7/lib2to3/fixes/fix_ws_comma.py \
	./usr/lib/python2.7/lib2to3/refactor.py \
	./usr/bin/2to3-2.7 \
	./usr/lib/python2.7/distutils/command/bdist_wininst.py \
	./usr/lib/python2.7/mimetypes.py \
	./usr/lib/python2.7/email/mime/image.py \
	./usr/share/doc/python2.7/NEWS.gz \
	./usr/lib/python2.7/multiprocessing/connection.py \
	./usr/lib/python2.7/distutils/command/check.py \
	./usr/lib/python2.7/compiler/ast.py \
	./usr/lib/python2.7/lib2to3/patcomp.py \
	./usr/lib/python2.7/distutils/command/bdist_rpm.py \
	./usr/lib/python2.7/unittest/signals.py \
	./usr/lib/python2.7/lib2to3/fixer_util.py \
	./usr/lib/python2.7/smtplib.py \
	./usr/lib/python2.7/ctypes/__init__.py \
	./usr/lib/python2.7/pyclbr.py \
	./usr/lib/python2.7/compiler/consts.py \
	./usr/lib/python2.7/ctypes/_endian.py \
	./usr/lib/python2.7/lib-dynload/Python-2.7.egg-info \
	./usr/lib/python2.7/lib2to3/fixes/fix_reduce.py \
	./usr/lib/python2.7/uuid.py \
	./usr/lib/python2.7/macpath.py \
	./usr/lib/python2.7/lib2to3/fixes/fix_itertools.py \
	./usr/lib/python2.7/audiodev.py \
	./usr/lib/python2.7/email/message.py \
	./usr/lib/python2.7/distutils/command/upload.py \
	./usr/lib/python2.7/Cookie.py \
	./usr/lib/python2.7/bsddb/db.py \
	./usr/lib/python2.7/pydoc.py \
	./usr/lib/python2.7/encodings/iso2022_jp_3.py \
	./usr/lib/python2.7/xml/sax/expatreader.py \
	./usr/lib/python2.7/unittest/result.py \
	./usr/lib/python2.7/lib2to3/pygram.py \
	./usr/lib/python2.7/email/mime/message.py \
	./usr/lib/python2.7/timeit.py \
	./usr/lib/python2.7/json/scanner.py \
	./usr/lib/python2.7/email/mime/audio.py \
	./usr/lib/python2.7/email/errors.py \
	./usr/lib/python2.7/distutils/command/install_scripts.py \
	./usr/lib/python2.7/multiprocessing/managers.py \
	./usr/lib/python2.7/plistlib.py \
	./usr/lib/python2.7/lib2to3/pgen2/grammar.py \
	./usr/lib/python2.7/SimpleHTTPServer.py \
	./usr/lib/python2.7/fractions.py \
	./usr/lib/python2.7/lib-dynload/audioop.so \
	./usr/lib/python2.7/lib-tk/Canvas.py \
	./usr/lib/python2.7/multiprocessing/queues.py \
	./usr/lib/python2.7/wsgiref/validate.py \
	./usr/lib/python2.7/lib-dynload/_codecs_iso2022.so \
	./usr/lib/python2.7/encodings/shift_jis_2004.py \
	./usr/lib/python2.7/lib2to3/pgen2/pgen.py \
	./usr/lib/python2.7/lib2to3/fixes/fix_print.py \
	./usr/lib/python2.7/wsgiref/util.py \
	./usr/lib/python2.7/email/mime/multipart.py \
	./usr/lib/python2.7/lib2to3/fixes/fix_nonzero.py \
	./usr/lib/python2.7/SocketServer.py \
	./usr/lib/python2.7/lib-tk/FixTk.py \
	./usr/lib/python2.7/threading.py \
	./usr/lib/python2.7/distutils/command/build_py.py \
	./usr/lib/python2.7/lib2to3/fixes/fix_itertools_imports.py \
	./usr/lib/python2.7/distutils/filelist.py \
	./usr/lib/python2.7/lib2to3/fixes/fix_types.py \
	./usr/lib/python2.7/lib-tk/Tkdnd.py \
	./usr/lib/python2.7/pydoc_data/__init__.py \
	./usr/lib/python2.7/mimetools.py \
	./usr/lib/python2.7/curses/textpad.py \
	./usr/lib/python2.7/plat-linux2/regen \
	./usr/lib/python2.7/HTMLParser.py \
	./usr/lib/python2.7/distutils/dep_util.py \
	./usr/lib/python2.7/ast.py \
	./usr/lib/python2.7/lib2to3/fixes/fix_raise.py \
	./usr/lib/python2.7/pipes.py \
	./usr/lib/python2.7/mimify.py \
	./usr/lib/python2.7/LICENSE.txt \
	./usr/lib/python2.7/lib2to3/fixes/fix_operator.py \
	./usr/lib/python2.7/lib-dynload/_multiprocessing.so \
	./usr/lib/python2.7/distutils/command/sdist.py \
	./usr/lib/python2.7/mailcap.py \
	./usr/lib/python2.7/pprint.py \
	./usr/lib/python2.7/curses/wrapper.py \
	./usr/lib/python2.7/wsgiref.egg-info \
	./usr/lib/python2.7/xml/etree/__init__.py \
	./usr/lib/python2.7/encodings/cp932.py \
	./usr/lib/python2.7/distutils/cygwinccompiler.py \
	./usr/lib/python2.7/xml/parsers/expat.py \
	./usr/share/pixmaps/python2.7.xpm \
	./usr/lib/python2.7/SimpleXMLRPCServer.py \
	./usr/lib/python2.7/shelve.py \
	./usr/lib/python2.7/lib2to3/pgen2/tokenize.py \
	./usr/lib/python2.7/multiprocessing/forking.py \
	./usr/lib/python2.7/encodings/iso2022_jp.py \
	./usr/lib/python2.7/email/utils.py \
	./usr/lib/python2.7/pty.py \
	./usr/lib/python2.7/distutils/command/bdist_msi.py\
"
FILES_python2.7-minimal = " \
	./usr/share/doc/python2.7-minimal/README.Debian \
	./usr/lib/python2.7/types.py \
	./usr/lib/python2.7/popen2.py \
	./usr/lib/python2.7/stringprep.py \
	./usr/lib/python2.7/encodings/utf_8.py \
	./usr/lib/python2.7/encodings/cp1253.py \
	./usr/lib/python2.7/encodings/palmos.py \
	./usr/lib/python2.7/encodings/mac_roman.py \
	./usr/lib/python2.7/encodings/utf_16_le.py \
	./usr/lib/python2.7/_abcoll.py \
	./usr/lib/python2.7/encodings/mac_latin2.py \
	./usr/lib/python2.7/traceback.py \
	./usr/lib/python2.7/encodings/iso8859_13.py \
	./usr/lib/python2.7/encodings/unicode_internal.py \
	./usr/lib/python2.7/encodings/cp860.py \
	./usr/include/python2.7/pyconfig.h \
	./usr/lib/python2.7/encodings/mac_romanian.py \
	./usr/lib/python2.7/shutil.py \
	./usr/lib/python2.7/runpy.py \
	./usr/lib/python2.7/encodings/utf_16_be.py \
	./usr/lib/python2.7/encodings/utf_32.py \
	./usr/lib/python2.7/encodings/utf_32_le.py \
	./usr/lib/python2.7/glob.py \
	./usr/lib/python2.7/UserDict.py \
	./usr/lib/python2.7/encodings/zlib_codec.py \
	./usr/lib/python2.7/encodings/iso8859_6.py \
	./usr/lib/python2.7/weakref.py \
	./usr/lib/python2.7/encodings/cp1256.py \
	./usr/lib/python2.7/encodings/cp869.py \
	./usr/lib/python2.7/encodings/iso8859_3.py \
	./usr/lib/python2.7/encodings/unicode_escape.py \
	./usr/lib/python2.7/lib-dynload/_hashlib.so \
	./usr/lib/python2.7/encodings/cp1257.py \
	./usr/lib/python2.7/encodings/cp855.py \
	./usr/lib/python2.7/opcode.py \
	./usr/lib/python2.7/abc.py \
	./usr/lib/python2.7/sre_compile.py \
	./etc/python2.7/sitecustomize.py \
	./usr/lib/python2.7/atexit.py \
	./usr/lib/python2.7/lib-dynload/_ssl.so \
	./usr/lib/python2.7/encodings/iso8859_5.py \
	./usr/lib/python2.7/encodings/idna.py \
	./usr/bin/python2.7 \
	./usr/lib/python2.7/encodings/mac_cyrillic.py \
	./usr/lib/python2.7/ConfigParser.py \
	./usr/lib/python2.7/sre_parse.py \
	./usr/lib/python2.7/encodings/cp424.py \
	./usr/lib/python2.7/encodings/cp862.py \
	./usr/lib/python2.7/encodings/iso8859_2.py \
	./usr/lib/python2.7/encodings/cp1252.py \
	./usr/lib/python2.7/re.py \
	./usr/lib/python2.7/encodings/iso8859_8.py \
	./usr/lib/python2.7/encodings/cp037.py \
	./usr/lib/python2.7/encodings/mbcs.py \
	./usr/lib/python2.7/encodings/cp866.py \
	./usr/lib/python2.7/encodings/iso8859_16.py \
	./usr/lib/python2.7/inspect.py \
	./usr/lib/python2.7/encodings/charmap.py \
	./usr/lib/python2.7/pickle.py \
	./usr/lib/python2.7/encodings/cp874.py \
	./usr/lib/python2.7/encodings/utf_16.py \
	./usr/lib/python2.7/encodings/uu_codec.py \
	./usr/share/doc/python2.7-minimal/copyright \
	./usr/lib/python2.7/socket.py \
	./usr/lib/python2.7/encodings/cp720.py \
	./usr/lib/python2.7/encodings/iso8859_10.py \
	./usr/lib/python2.7/encodings/__init__.py \
	./usr/lib/python2.7/encodings/mac_farsi.py \
	./usr/lib/python2.7/encodings/cp857.py \
	./usr/lib/python2.7/copy.py \
	./usr/lib/python2.7/encodings/hp_roman8.py \
	./usr/lib/python2.7/encodings/cp858.py \
	./usr/lib/python2.7/keyword.py \
	./usr/lib/python2.7/encodings/utf_32_be.py \
	./usr/lib/python2.7/copy_reg.py \
	./usr/lib/python2.7/StringIO.py \
	./usr/lib/python2.7/encodings/iso8859_4.py \
	./usr/lib/python2.7/encodings/aliases.py \
	./usr/lib/python2.7/encodings/quopri_codec.py \
	./usr/lib/python2.7/encodings/cp1255.py \
	./usr/lib/python2.7/encodings/iso8859_14.py \
	./usr/lib/python2.7/genericpath.py \
	./usr/lib/python2.7/linecache.py \
	./usr/lib/python2.7/collections.py \
	./usr/lib/python2.7/encodings/iso8859_11.py \
	./usr/lib/python2.7/encodings/cp1258.py \
	./usr/lib/python2.7/os.py \
	./usr/lib/python2.7/encodings/cp1140.py \
	./usr/lib/python2.7/optparse.py \
	./usr/lib/python2.7/encodings/iso8859_15.py \
	./usr/lib/python2.7/logging/config.py \
	./usr/lib/python2.7/encodings/iso8859_9.py \
	./usr/lib/python2.7/__future__.py \
	./usr/share/binfmts/python2.7 \
	./usr/lib/python2.7/dis.py \
	./usr/lib/python2.7/encodings/cp1250.py \
	./usr/lib/python2.7/encodings/raw_unicode_escape.py \
	./usr/lib/python2.7/encodings/cp856.py \
	./usr/lib/python2.7/textwrap.py \
	./usr/lib/python2.7/encodings/hex_codec.py \
	./usr/lib/python2.7/_sysconfigdata.py \
	./usr/lib/python2.7/random.py \
	./usr/lib/python2.7/string.py \
	./usr/lib/python2.7/encodings/koi8_u.py \
	./usr/lib/python2.7/stat.py \
	./usr/lib/python2.7/encodings/iso8859_7.py \
	./usr/lib/python2.7/base64.py \
	./usr/lib/python2.7/logging/handlers.py \
	./usr/lib/python2.7/encodings/utf_7.py \
	./usr/lib/python2.7/md5.py \
	./usr/lib/python2.7/hashlib.py \
	./usr/lib/python2.7/logging/__init__.py \
	./usr/lib/python2.7/encodings/cp437.py \
	./usr/lib/python2.7/struct.py \
	./usr/lib/python2.7/encodings/hz.py \
	./usr/lib/python2.7/encodings/undefined.py \
	./usr/lib/python2.7/encodings/cp737.py \
	./usr/lib/python2.7/ssl.py \
	./usr/lib/python2.7/warnings.py \
	./usr/lib/python2.7/encodings/latin_1.py \
	./usr/lib/python2.7/encodings/cp1026.py \
	./usr/lib/python2.7/token.py \
	./usr/lib/python2.7/encodings/cp500.py \
	./usr/lib/python2.7/bisect.py \
	./usr/lib/python2.7/encodings/ascii.py \
	./usr/lib/python2.7/encodings/mac_arabic.py \
	./usr/lib/python2.7/sre_constants.py \
	./usr/lib/python2.7/tempfile.py \
	./usr/lib/python2.7/repr.py \
	./usr/lib/python2.7/encodings/cp861.py \
	./usr/lib/python2.7/encodings/ptcp154.py \
	./usr/lib/python2.7/encodings/mac_centeuro.py \
	./usr/lib/python2.7/encodings/base64_codec.py \
	./usr/lib/python2.7/fnmatch.py \
	./usr/lib/python2.7/encodings/mac_iceland.py \
	./usr/lib/python2.7/encodings/iso8859_1.py \
	./usr/lib/python2.7/encodings/punycode.py \
	./usr/lib/python2.7/encodings/cp865.py \
	./usr/lib/python2.7/sitecustomize.py \
	./usr/lib/python2.7/_weakrefset.py \
	./usr/lib/python2.7/encodings/cp852.py \
	./usr/lib/python2.7/encodings/cp1006.py \
	./usr/lib/python2.7/encodings/tis_620.py \
	./usr/lib/python2.7/platform.py \
	./usr/lib/python2.7/encodings/rot_13.py \
	./usr/lib/python2.7/encodings/cp1251.py \
	./usr/lib/python2.7/heapq.py \
	./usr/lib/python2.7/encodings/mac_greek.py \
	./usr/share/doc/python2.7-minimal/changelog.Debian.gz \
	./usr/lib/python2.7/site.py \
	./usr/lib/python2.7/posixpath.py \
	./usr/lib/python2.7/py_compile.py \
	./usr/lib/python2.7/encodings/cp775.py \
	./usr/lib/python2.7/tokenize.py \
	./usr/lib/python2.7/getopt.py \
	./usr/lib/python2.7/sre.py \
	./usr/lib/python2.7/sysconfig.py \
	./usr/lib/python2.7/encodings/cp850.py \
	./usr/lib/python2.7/_sysconfigdata_nd.py \
	./usr/lib/python2.7/codecs.py \
	./usr/lib/python2.7/compileall.py \
	./usr/lib/python2.7/functools.py \
	./usr/share/man/man1/python2.7.1.gz \
	./usr/lib/python2.7/encodings/koi8_r.py \
	./usr/lib/python2.7/encodings/cp863.py \
	./usr/lib/python2.7/pkgutil.py \
	./usr/lib/python2.7/subprocess.py \
	./usr/lib/python2.7/encodings/mac_croatian.py \
	./usr/lib/python2.7/sha.py \
	./usr/lib/python2.7/encodings/cp1254.py \
	./usr/lib/python2.7/encodings/utf_8_sig.py \
	./usr/lib/python2.7/encodings/string_escape.py \
	./usr/lib/python2.7/encodings/mac_turkish.py \
	./usr/lib/python2.7/encodings/cp864.py \
	./usr/lib/python2.7/config/Makefile \
	./usr/lib/python2.7/encodings/cp875.py\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"