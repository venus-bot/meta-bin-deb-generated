PACKAGES = "${PN} python3-distutils python3-lib2to3"
PROVIDES = "python3-distutils python3-lib2to3"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/p/python3-stdlib-extensions/python3-distutils_3.7.3-1_all.deb;unpack=0;name=deb0\
	http://archive.raspbian.org/raspbian/pool/main/p/python3-stdlib-extensions/python3-lib2to3_3.7.3-1_all.deb;unpack=0;name=deb1\
"
DEBFILENAME_python3-distutils = "python3-distutils_3.7.3-1_all.deb"
SRC_URI[deb0.sha256sum] = "6918af11061d3141990e78f5ad0530ec0f9a188cac27113d9de2896203efc13f"
SRC_URI[deb0.md5sum] = "ba465b865bee95854f4a2200d40fa7d7"
DEBFILENAME_python3-lib2to3 = "python3-lib2to3_3.7.3-1_all.deb"
SRC_URI[deb1.sha256sum] = "227e2a2d12922c00dee9e55d8c5b889cfc5e72a54b85c2a509fa1664c2e9e137"
SRC_URI[deb1.md5sum] = "0f19d3aee683bf847698f15b7a30b00a"

RDEPENDS_python3-distutils = "python3 (<< 3.8) python3 (>= 3.7.1-1~) python3-lib2to3 (>= 3.6.4)"
RDEPENDS_python3-lib2to3 = "python3 (<< 3.8) python3 (>= 3.7.1-1~)"
DEPENDS = "python3"


inherit deb_group

FILES_python3-distutils = " \
    ./usr/lib/python3.7/distutils/README \
    ./usr/lib/python3.7/distutils/_msvccompiler.py \
    ./usr/lib/python3.7/distutils/archive_util.py \
    ./usr/lib/python3.7/distutils/bcppcompiler.py \
    ./usr/lib/python3.7/distutils/ccompiler.py \
    ./usr/lib/python3.7/distutils/cmd.py \
    ./usr/lib/python3.7/distutils/command/__init__.py \
    ./usr/lib/python3.7/distutils/command/bdist.py \
    ./usr/lib/python3.7/distutils/command/bdist_dumb.py \
    ./usr/lib/python3.7/distutils/command/bdist_msi.py \
    ./usr/lib/python3.7/distutils/command/bdist_rpm.py \
    ./usr/lib/python3.7/distutils/command/bdist_wininst.py \
    ./usr/lib/python3.7/distutils/command/build.py \
    ./usr/lib/python3.7/distutils/command/build_clib.py \
    ./usr/lib/python3.7/distutils/command/build_ext.py \
    ./usr/lib/python3.7/distutils/command/build_py.py \
    ./usr/lib/python3.7/distutils/command/build_scripts.py \
    ./usr/lib/python3.7/distutils/command/check.py \
    ./usr/lib/python3.7/distutils/command/clean.py \
    ./usr/lib/python3.7/distutils/command/command_template \
    ./usr/lib/python3.7/distutils/command/config.py \
    ./usr/lib/python3.7/distutils/command/install.py \
    ./usr/lib/python3.7/distutils/command/install_data.py \
    ./usr/lib/python3.7/distutils/command/install_egg_info.py \
    ./usr/lib/python3.7/distutils/command/install_headers.py \
    ./usr/lib/python3.7/distutils/command/install_lib.py \
    ./usr/lib/python3.7/distutils/command/install_scripts.py \
    ./usr/lib/python3.7/distutils/command/register.py \
    ./usr/lib/python3.7/distutils/command/sdist.py \
    ./usr/lib/python3.7/distutils/command/upload.py \
    ./usr/lib/python3.7/distutils/config.py \
    ./usr/lib/python3.7/distutils/core.py \
    ./usr/lib/python3.7/distutils/cygwinccompiler.py \
    ./usr/lib/python3.7/distutils/debug.py \
    ./usr/lib/python3.7/distutils/dep_util.py \
    ./usr/lib/python3.7/distutils/dir_util.py \
    ./usr/lib/python3.7/distutils/dist.py \
    ./usr/lib/python3.7/distutils/errors.py \
    ./usr/lib/python3.7/distutils/extension.py \
    ./usr/lib/python3.7/distutils/fancy_getopt.py \
    ./usr/lib/python3.7/distutils/file_util.py \
    ./usr/lib/python3.7/distutils/filelist.py \
    ./usr/lib/python3.7/distutils/log.py \
    ./usr/lib/python3.7/distutils/msvc9compiler.py \
    ./usr/lib/python3.7/distutils/msvccompiler.py \
    ./usr/lib/python3.7/distutils/spawn.py \
    ./usr/lib/python3.7/distutils/sysconfig.py \
    ./usr/lib/python3.7/distutils/text_file.py \
    ./usr/lib/python3.7/distutils/unixccompiler.py \
    ./usr/lib/python3.7/distutils/util.py \
    ./usr/lib/python3.7/distutils/versionpredicate.py \
    ./usr/share/doc/python3-distutils/README.Debian \
    ./usr/share/doc/python3-distutils/changelog.Debian.gz \
    ./usr/share/doc/python3-distutils/copyright \
    ./usr/share/lintian/overrides/python3-distutils\
"
FILES_python3-lib2to3 = " \
    ./usr/lib/python3.7/lib2to3/Grammar.txt \
    ./usr/lib/python3.7/lib2to3/PatternGrammar.txt \
    ./usr/lib/python3.7/lib2to3/__init__.py \
    ./usr/lib/python3.7/lib2to3/__main__.py \
    ./usr/lib/python3.7/lib2to3/btm_matcher.py \
    ./usr/lib/python3.7/lib2to3/btm_utils.py \
    ./usr/lib/python3.7/lib2to3/fixer_base.py \
    ./usr/lib/python3.7/lib2to3/fixer_util.py \
    ./usr/lib/python3.7/lib2to3/fixes/__init__.py \
    ./usr/lib/python3.7/lib2to3/fixes/fix_apply.py \
    ./usr/lib/python3.7/lib2to3/fixes/fix_asserts.py \
    ./usr/lib/python3.7/lib2to3/fixes/fix_basestring.py \
    ./usr/lib/python3.7/lib2to3/fixes/fix_buffer.py \
    ./usr/lib/python3.7/lib2to3/fixes/fix_dict.py \
    ./usr/lib/python3.7/lib2to3/fixes/fix_except.py \
    ./usr/lib/python3.7/lib2to3/fixes/fix_exec.py \
    ./usr/lib/python3.7/lib2to3/fixes/fix_execfile.py \
    ./usr/lib/python3.7/lib2to3/fixes/fix_exitfunc.py \
    ./usr/lib/python3.7/lib2to3/fixes/fix_filter.py \
    ./usr/lib/python3.7/lib2to3/fixes/fix_funcattrs.py \
    ./usr/lib/python3.7/lib2to3/fixes/fix_future.py \
    ./usr/lib/python3.7/lib2to3/fixes/fix_getcwdu.py \
    ./usr/lib/python3.7/lib2to3/fixes/fix_has_key.py \
    ./usr/lib/python3.7/lib2to3/fixes/fix_idioms.py \
    ./usr/lib/python3.7/lib2to3/fixes/fix_import.py \
    ./usr/lib/python3.7/lib2to3/fixes/fix_imports.py \
    ./usr/lib/python3.7/lib2to3/fixes/fix_imports2.py \
    ./usr/lib/python3.7/lib2to3/fixes/fix_input.py \
    ./usr/lib/python3.7/lib2to3/fixes/fix_intern.py \
    ./usr/lib/python3.7/lib2to3/fixes/fix_isinstance.py \
    ./usr/lib/python3.7/lib2to3/fixes/fix_itertools.py \
    ./usr/lib/python3.7/lib2to3/fixes/fix_itertools_imports.py \
    ./usr/lib/python3.7/lib2to3/fixes/fix_long.py \
    ./usr/lib/python3.7/lib2to3/fixes/fix_map.py \
    ./usr/lib/python3.7/lib2to3/fixes/fix_metaclass.py \
    ./usr/lib/python3.7/lib2to3/fixes/fix_methodattrs.py \
    ./usr/lib/python3.7/lib2to3/fixes/fix_ne.py \
    ./usr/lib/python3.7/lib2to3/fixes/fix_next.py \
    ./usr/lib/python3.7/lib2to3/fixes/fix_nonzero.py \
    ./usr/lib/python3.7/lib2to3/fixes/fix_numliterals.py \
    ./usr/lib/python3.7/lib2to3/fixes/fix_operator.py \
    ./usr/lib/python3.7/lib2to3/fixes/fix_paren.py \
    ./usr/lib/python3.7/lib2to3/fixes/fix_print.py \
    ./usr/lib/python3.7/lib2to3/fixes/fix_raise.py \
    ./usr/lib/python3.7/lib2to3/fixes/fix_raw_input.py \
    ./usr/lib/python3.7/lib2to3/fixes/fix_reduce.py \
    ./usr/lib/python3.7/lib2to3/fixes/fix_reload.py \
    ./usr/lib/python3.7/lib2to3/fixes/fix_renames.py \
    ./usr/lib/python3.7/lib2to3/fixes/fix_repr.py \
    ./usr/lib/python3.7/lib2to3/fixes/fix_set_literal.py \
    ./usr/lib/python3.7/lib2to3/fixes/fix_standarderror.py \
    ./usr/lib/python3.7/lib2to3/fixes/fix_sys_exc.py \
    ./usr/lib/python3.7/lib2to3/fixes/fix_throw.py \
    ./usr/lib/python3.7/lib2to3/fixes/fix_tuple_params.py \
    ./usr/lib/python3.7/lib2to3/fixes/fix_types.py \
    ./usr/lib/python3.7/lib2to3/fixes/fix_unicode.py \
    ./usr/lib/python3.7/lib2to3/fixes/fix_urllib.py \
    ./usr/lib/python3.7/lib2to3/fixes/fix_ws_comma.py \
    ./usr/lib/python3.7/lib2to3/fixes/fix_xrange.py \
    ./usr/lib/python3.7/lib2to3/fixes/fix_xreadlines.py \
    ./usr/lib/python3.7/lib2to3/fixes/fix_zip.py \
    ./usr/lib/python3.7/lib2to3/main.py \
    ./usr/lib/python3.7/lib2to3/patcomp.py \
    ./usr/lib/python3.7/lib2to3/pgen2/__init__.py \
    ./usr/lib/python3.7/lib2to3/pgen2/conv.py \
    ./usr/lib/python3.7/lib2to3/pgen2/driver.py \
    ./usr/lib/python3.7/lib2to3/pgen2/grammar.py \
    ./usr/lib/python3.7/lib2to3/pgen2/literals.py \
    ./usr/lib/python3.7/lib2to3/pgen2/parse.py \
    ./usr/lib/python3.7/lib2to3/pgen2/pgen.py \
    ./usr/lib/python3.7/lib2to3/pgen2/token.py \
    ./usr/lib/python3.7/lib2to3/pgen2/tokenize.py \
    ./usr/lib/python3.7/lib2to3/pygram.py \
    ./usr/lib/python3.7/lib2to3/pytree.py \
    ./usr/lib/python3.7/lib2to3/refactor.py \
    ./usr/share/doc/python3-lib2to3/changelog.Debian.gz \
    ./usr/share/doc/python3-lib2to3/copyright \
    ./usr/share/lintian/overrides/python3-lib2to3\
"
