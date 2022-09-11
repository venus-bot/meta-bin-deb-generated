PACKAGES = "${PN} libxslt1.1"
PROVIDES = "libxslt1.1"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/libx/libxslt/libxslt1.1_1.1.32-2.2~deb10u2_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libxslt1.1 = "libxslt1.1_1.1.32-2.2~deb10u2_armhf.deb"
SRC_URI[deb0.sha256sum] = "fc7ab355f2086114df0ec38b1f0fa9cdd7046844161de23683ccf44b610b59a8"
SRC_URI[deb0.md5sum] = "402540571b307760f3621de77a1d1a64"

RDEPENDS_${PN}1.1 = "libc6 (>= 2.17) libgcrypt20 (>= 1.8.0) libxml2 (>= 2.9.0)"
DEPENDS = "libc6 libgcrypt20 libxml2"


inherit deb_group

FILES_libxslt1.1 = " \
    ./usr/lib/arm-linux-gnueabihf/libexslt.so.0 \
    ./usr/lib/arm-linux-gnueabihf/libexslt.so.0.8.20 \
    ./usr/lib/arm-linux-gnueabihf/libxslt.so.1 \
    ./usr/lib/arm-linux-gnueabihf/libxslt.so.1.1.32 \
    ./usr/share/doc/libxslt1.1/AUTHORS \
    ./usr/share/doc/libxslt1.1/FEATURES.gz \
    ./usr/share/doc/libxslt1.1/NEWS.gz \
    ./usr/share/doc/libxslt1.1/README \
    ./usr/share/doc/libxslt1.1/README.Debian \
    ./usr/share/doc/libxslt1.1/TODO \
    ./usr/share/doc/libxslt1.1/changelog.Debian.gz \
    ./usr/share/doc/libxslt1.1/changelog.gz \
    ./usr/share/doc/libxslt1.1/copyright \
    ./usr/share/lintian/overrides/libxslt1.1\
"
