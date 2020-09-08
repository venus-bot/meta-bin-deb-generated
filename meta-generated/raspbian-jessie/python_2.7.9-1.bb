PACKAGES = "${PN} libpython-stdlib python python-minimal"
PROVIDES = "libpython-stdlib python python-minimal"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/p/python-defaults/libpython-stdlib_2.7.9-1_armhf.deb;unpack=0;name=deb0\
	http://archive.raspbian.org/raspbian/pool/main/p/python-defaults/python_2.7.9-1_armhf.deb;unpack=0;name=deb1\
	http://archive.raspbian.org/raspbian/pool/main/p/python-defaults/python-minimal_2.7.9-1_armhf.deb;unpack=0;name=deb2\
"
DEBFILENAME_libpython-stdlib = "libpython-stdlib_2.7.9-1_armhf.deb"
SRC_URI[deb0.sha256sum] = "51243cfde240240989f7e1b82171eb2adfe6df76cc440130d2d309c6f0ffe36c"
SRC_URI[deb0.md5sum] = "9169f2e0b037f8201b72d6df0aaae9fc"
DEBFILENAME_python = "python_2.7.9-1_armhf.deb"
SRC_URI[deb1.sha256sum] = "80005782f2e137294160d2fff5a8d9e563ca9c7b7ba1d7f4c6966f5866016921"
SRC_URI[deb1.md5sum] = "2022a62a92c00cf30386b762847ccd3d"
DEBFILENAME_python-minimal = "python-minimal_2.7.9-1_armhf.deb"
SRC_URI[deb2.sha256sum] = "b6bb6e2c05a71c0f5841cc256963f0c82daac362c2e97142e5d8d2b291bb0773"
SRC_URI[deb2.md5sum] = "8fac628bfb15a26e036f7639dcedd1de"

RDEPENDS_lib${PN}-stdlib = "libpython2.7-stdlib (>= 2.7.9-1~)"
RDEPENDS_${PN} = "libpython-stdlib (= 2.7.9-1) python-minimal (= 2.7.9-1) python2.7 (>= 2.7.9-1~)"
RDEPENDS_${PN}-minimal = "dpkg (>= 1.13.20) python2.7-minimal (>= 2.7.9-1~)"
DEPENDS = "dpkg libpython2.7-stdlib python2.7 python2.7-minimal"


inherit deb_group

FILES_libpython-stdlib = " \
    ./usr/share/doc/libpython-stdlib/README.Debian \
    ./usr/share/doc/libpython-stdlib/changelog.Debian.gz \
    ./usr/share/doc/libpython-stdlib/copyright\
"
FILES_${PN} = " \
    ./usr/bin/2to3 \
    ./usr/bin/dh_python2 \
    ./usr/bin/pdb \
    ./usr/bin/pydoc \
    ./usr/bin/pygettext \
    ./usr/lib/valgrind/python.supp \
    ./usr/share/apps/konsole/python.desktop \
    ./usr/share/debhelper/autoscripts/postinst-pycompile \
    ./usr/share/debhelper/autoscripts/preinst-pycentral-clean \
    ./usr/share/debhelper/autoscripts/prerm-pyclean \
    ./usr/share/doc-base/python-policy \
    ./usr/share/doc/python/FAQ.html \
    ./usr/share/doc/python/README.Debian \
    ./usr/share/doc/python/changelog.Debian.gz \
    ./usr/share/doc/python/copyright \
    ./usr/share/doc/python/faq/extending.html \
    ./usr/share/doc/python/faq/general.html \
    ./usr/share/doc/python/faq/gui.html \
    ./usr/share/doc/python/faq/installed.html \
    ./usr/share/doc/python/faq/library.html \
    ./usr/share/doc/python/faq/programming.html \
    ./usr/share/doc/python/faq/windows.html \
    ./usr/share/doc/python/python-policy.html/ap-build_dependencies.html \
    ./usr/share/doc/python/python-policy.html/ap-packaging_tools.html \
    ./usr/share/doc/python/python-policy.html/ap-upgrade.html \
    ./usr/share/doc/python/python-policy.html/ch-embed.html \
    ./usr/share/doc/python/python-policy.html/ch-module_packages.html \
    ./usr/share/doc/python/python-policy.html/ch-other.html \
    ./usr/share/doc/python/python-policy.html/ch-programs.html \
    ./usr/share/doc/python/python-policy.html/ch-python.html \
    ./usr/share/doc/python/python-policy.html/ch-python3.html \
    ./usr/share/doc/python/python-policy.html/index.html \
    ./usr/share/doc/python/python-policy.sgml.gz \
    ./usr/share/doc/python/python-policy.txt.gz \
    ./usr/share/doc/python2.7/python-policy.html \
    ./usr/share/doc/python2.7/python-policy.sgml.gz \
    ./usr/share/doc/python2.7/python-policy.txt.gz \
    ./usr/share/lintian/overrides/python \
    ./usr/share/man/man1/2to3.1.gz \
    ./usr/share/man/man1/dh_python2.1.gz \
    ./usr/share/man/man1/pdb.1.gz \
    ./usr/share/man/man1/pydoc.1.gz \
    ./usr/share/man/man1/pygettext.1.gz \
    ./usr/share/perl5/Debian/Debhelper/Sequence/python2.pm \
    ./usr/share/pixmaps/python.xpm \
    ./usr/share/python/dh_python2 \
    ./usr/share/python/dist_fallback \
    ./usr/share/python/python.mk \
    ./usr/share/python/runtime.d/public_modules.rtinstall \
    ./usr/share/python/runtime.d/public_modules.rtremove\
"
FILES_python-minimal = " \
    ./usr/bin/pyclean \
    ./usr/bin/pycompile \
    ./usr/bin/python \
    ./usr/bin/python2 \
    ./usr/bin/pyversions \
    ./usr/share/doc/python-minimal/README.Debian \
    ./usr/share/doc/python-minimal/changelog.Debian.gz \
    ./usr/share/doc/python-minimal/copyright \
    ./usr/share/man/man1/pyclean.1.gz \
    ./usr/share/man/man1/pycompile.1.gz \
    ./usr/share/man/man1/python.1.gz \
    ./usr/share/man/man1/python2.1.gz \
    ./usr/share/man/man1/pyversions.1.gz \
    ./usr/share/python/debian_defaults \
    ./usr/share/python/debpython/__init__.py \
    ./usr/share/python/debpython/debhelper.py \
    ./usr/share/python/debpython/depends.py \
    ./usr/share/python/debpython/files.py \
    ./usr/share/python/debpython/namespace.py \
    ./usr/share/python/debpython/option.py \
    ./usr/share/python/debpython/pydist.py \
    ./usr/share/python/debpython/tools.py \
    ./usr/share/python/debpython/version.py \
    ./usr/share/python/pyversions.py\
"
