PACKAGES = "${PN} libxslt1.1"
PROVIDES = "libxslt1.1"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/libx/libxslt/libxslt1.1_1.1.28-2+deb8u4_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libxslt1.1 = "libxslt1.1_1.1.28-2+deb8u4_armhf.deb"
SRC_URI[deb0.sha256sum] = "535d5f86eff93ac4e85b4e7b77f6ada44b585781b02aaeda3cd8c9dafc40426c"
SRC_URI[deb0.md5sum] = "535e22f6171a74bcf930233b63195be5"

RDEPENDS_${PN}1.1 = "libc6 (>= 2.17) libgcrypt20 (>= 1.6.0) libxml2 (>= 2.9.0)"
DEPENDS = "libc6 libgcrypt20 libxml2"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_libxslt1.1 = " \
    ./usr/lib/arm-linux-gnueabihf/libexslt.so.0 \
    ./usr/lib/arm-linux-gnueabihf/libexslt.so.0.8.17 \
    ./usr/lib/arm-linux-gnueabihf/libxslt.so.1 \
    ./usr/lib/arm-linux-gnueabihf/libxslt.so.1.1.28 \
    ./usr/share/doc/libxslt1.1/AUTHORS \
    ./usr/share/doc/libxslt1.1/FEATURES.gz \
    ./usr/share/doc/libxslt1.1/NEWS.gz \
    ./usr/share/doc/libxslt1.1/README \
    ./usr/share/doc/libxslt1.1/README.Debian \
    ./usr/share/doc/libxslt1.1/TODO \
    ./usr/share/doc/libxslt1.1/TODO.Debian \
    ./usr/share/doc/libxslt1.1/changelog.Debian.gz \
    ./usr/share/doc/libxslt1.1/changelog.gz \
    ./usr/share/doc/libxslt1.1/copyright \
    ./usr/share/lintian/overrides/libxslt1.1\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
