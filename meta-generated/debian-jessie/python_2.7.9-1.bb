PACKAGES = "${PN} libpython-stdlib python"
PROVIDES = "libpython-stdlib python"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/p/python-defaults/libpython-stdlib_2.7.9-1_armhf.deb;unpack=0;name=deb0\
	http://ftp.de.debian.org/debian/pool/main/p/python-defaults/python_2.7.9-1_armhf.deb;unpack=0;name=deb1\
"
DEBFILENAME_libpython-stdlib = "libpython-stdlib_2.7.9-1_armhf.deb"
SRC_URI[deb0.sha256sum] = "34bde3ba85f2b2851f3be9c38643cdf9b1d6ccc083601a45008b880169b8c08d"
SRC_URI[deb0.md5sum] = "837885b5ed1129a6906257beefae0ff4"
DEBFILENAME_python = "python_2.7.9-1_armhf.deb"
SRC_URI[deb1.sha256sum] = "ef6cb9125827ed5bf39f1a28c49a685f97dfd8ea190fdba90b5caa1bca9253ae"
SRC_URI[deb1.md5sum] = "bfdd1daca9ce7046c5af26649ff15276"

RDEPENDS_lib${PN}-stdlib = "libpython2.7-stdlib (>= 2.7.9-1~)"
RDEPENDS_${PN} = "libpython-stdlib (= 2.7.9-1) python2.7 (>= 2.7.9-1~)"
DEPENDS = "libpython2.7-stdlib python2.7"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

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
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
