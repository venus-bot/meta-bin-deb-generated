PACKAGES = "${PN} libpython-stdlib libpython2-stdlib python python-minimal python2 python2-minimal"
PROVIDES = "libpython-stdlib libpython2-stdlib python python-minimal python2 python2-minimal"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/p/python-defaults/libpython-stdlib_2.7.16-1_armhf.deb;unpack=0;name=deb0\
	http://ftp.de.debian.org/debian/pool/main/p/python-defaults/libpython2-stdlib_2.7.16-1_armhf.deb;unpack=0;name=deb1\
	http://ftp.de.debian.org/debian/pool/main/p/python-defaults/python_2.7.16-1_armhf.deb;unpack=0;name=deb2\
	http://ftp.de.debian.org/debian/pool/main/p/python-defaults/python-minimal_2.7.16-1_armhf.deb;unpack=0;name=deb3\
	http://ftp.de.debian.org/debian/pool/main/p/python-defaults/python2_2.7.16-1_armhf.deb;unpack=0;name=deb4\
	http://ftp.de.debian.org/debian/pool/main/p/python-defaults/python2-minimal_2.7.16-1_armhf.deb;unpack=0;name=deb5\
"
DEBFILENAME_libpython-stdlib = "libpython-stdlib_2.7.16-1_armhf.deb"
SRC_URI[deb0.sha256sum] = "e294319b53573ef4c10f302110b36150d3ccc8c5ef9447a53cd48ecb642ed541"
SRC_URI[deb0.md5sum] = "225fd6b4ffce3bd3de7075e3b8d4be93"
DEBFILENAME_libpython2-stdlib = "libpython2-stdlib_2.7.16-1_armhf.deb"
SRC_URI[deb1.sha256sum] = "2e02957114b5f0375fcead420708ab54f191956f44fcdca879acbd59fdc24abf"
SRC_URI[deb1.md5sum] = "c97e5c055a4ba82cbccc0506b42c6766"
DEBFILENAME_python = "python_2.7.16-1_armhf.deb"
SRC_URI[deb2.sha256sum] = "8422eb38bdc248b9c661fb88620ce6c8c6a9d12e51c5cbb0354b8a8a5bda37f2"
SRC_URI[deb2.md5sum] = "7f75cfc491ca59f91d418f5362baba22"
DEBFILENAME_python-minimal = "python-minimal_2.7.16-1_armhf.deb"
SRC_URI[deb3.sha256sum] = "0d52e2e446c29a36656af8b8bf68bc5ca458fa2c805aea3e9685f55fc01251e6"
SRC_URI[deb3.md5sum] = "cf88c4a0b72291fc77907fe47729e0e9"
DEBFILENAME_python2 = "python2_2.7.16-1_armhf.deb"
SRC_URI[deb4.sha256sum] = "f85e43f68ddb88e64ab187d355973fab7129c0561fd1d7786588c90055a1b6b5"
SRC_URI[deb4.md5sum] = "a47ddbfdb46bd953aa0212fc830d793c"
DEBFILENAME_python2-minimal = "python2-minimal_2.7.16-1_armhf.deb"
SRC_URI[deb5.sha256sum] = "dd296eedf1994524cc92e77dc8ddd4bc674ea76de977d6a1d246c5cf2a5e6a1f"
SRC_URI[deb5.md5sum] = "8da0bfd71ecfaa79ee33079e21043c3d"

RDEPENDS_lib${PN}-stdlib = "libpython2-stdlib (= 2.7.16-1) libpython2.7-stdlib (>= 2.7.16-1~)"
RDEPENDS_lib${PN}2-stdlib = "libpython2.7-stdlib (>= 2.7.16-1~)"
RDEPENDS_${PN} = "libpython-stdlib (= 2.7.16-1) python-minimal (= 2.7.16-1) python2 (= 2.7.16-1) python2.7 (>= 2.7.16-1~)"
RDEPENDS_${PN}-minimal = "dpkg (>= 1.13.20) python2-minimal (= 2.7.16-1) python2.7-minimal (>= 2.7.16-1~)"
RDEPENDS_${PN}2 = "libpython2-stdlib (= 2.7.16-1) python2-minimal (= 2.7.16-1) python2.7 (>= 2.7.16-1~)"
RDEPENDS_${PN}2-minimal = "dpkg (>= 1.13.20) python2.7-minimal (>= 2.7.16-1~)"
DEPENDS = "dpkg libpython2.7-stdlib python2.7 python2.7-minimal"


inherit deb_group

FILES_libpython-stdlib = " \
    ./usr/share/doc/libpython-stdlib/README.Debian \
    ./usr/share/doc/libpython-stdlib/changelog.Debian.gz \
    ./usr/share/doc/libpython-stdlib/copyright\
"
FILES_libpython2-stdlib = " \
    ./usr/share/doc/libpython2-stdlib/README.Debian \
    ./usr/share/doc/libpython2-stdlib/changelog.Debian.gz \
    ./usr/share/doc/libpython2-stdlib/copyright\
"
FILES_${PN} = " \
    ./usr/bin/pdb \
    ./usr/bin/pydoc \
    ./usr/bin/pygettext \
    ./usr/lib/valgrind/python.supp \
    ./usr/share/apps/konsole/python.desktop \
    ./usr/share/doc/python/README.Debian \
    ./usr/share/doc/python/changelog.Debian.gz \
    ./usr/share/doc/python/copyright \
    ./usr/share/lintian/overrides/python \
    ./usr/share/man/man1/pdb.1.gz \
    ./usr/share/man/man1/pydoc.1.gz \
    ./usr/share/man/man1/pygettext.1.gz \
    ./usr/share/pixmaps/python.xpm\
"
FILES_python-minimal = " \
    ./usr/bin/python \
    ./usr/share/doc/python-minimal/README.Debian \
    ./usr/share/doc/python-minimal/changelog.Debian.gz \
    ./usr/share/doc/python-minimal/copyright \
    ./usr/share/man/man1/python.1.gz\
"
FILES_python2 = " \
    ./usr/bin/dh_python2 \
    ./usr/bin/pdb2 \
    ./usr/bin/pydoc2 \
    ./usr/bin/pygettext2 \
    ./usr/lib/valgrind/python2.supp \
    ./usr/share/apps/konsole/python2.desktop \
    ./usr/share/debhelper/autoscripts/postinst-pycompile \
    ./usr/share/debhelper/autoscripts/preinst-pycentral-clean \
    ./usr/share/debhelper/autoscripts/prerm-pyclean \
    ./usr/share/doc/python2/README.Debian \
    ./usr/share/doc/python2/changelog.Debian.gz \
    ./usr/share/doc/python2/copyright \
    ./usr/share/lintian/overrides/python2 \
    ./usr/share/man/man1/dh_python2.1.gz \
    ./usr/share/man/man1/pdb2.1.gz \
    ./usr/share/man/man1/pydoc2.1.gz \
    ./usr/share/man/man1/pygettext2.1.gz \
    ./usr/share/perl5/Debian/Debhelper/Sequence/python2.pm \
    ./usr/share/pixmaps/python2.xpm \
    ./usr/share/python/dh_python2 \
    ./usr/share/python/dist_fallback \
    ./usr/share/python/python.mk \
    ./usr/share/python/runtime.d/public_modules.rtinstall \
    ./usr/share/python/runtime.d/public_modules.rtremove\
"
FILES_python2-minimal = " \
    ./usr/bin/pyclean \
    ./usr/bin/pycompile \
    ./usr/bin/python2 \
    ./usr/bin/pyversions \
    ./usr/share/doc/python2-minimal/README.Debian \
    ./usr/share/doc/python2-minimal/changelog.Debian.gz \
    ./usr/share/doc/python2-minimal/copyright \
    ./usr/share/man/man1/pyclean.1.gz \
    ./usr/share/man/man1/pycompile.1.gz \
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
