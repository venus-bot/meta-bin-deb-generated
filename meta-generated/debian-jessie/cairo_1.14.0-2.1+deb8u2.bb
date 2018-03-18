PACKAGES = "${PN} libcairo-gobject2 libcairo2"
PROVIDES = "libcairo-gobject2 libcairo2"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/c/cairo/libcairo-gobject2_1.14.0-2.1+deb8u2_armhf.deb;unpack=0;name=deb0\
	http://ftp.de.debian.org/debian/pool/main/c/cairo/libcairo2_1.14.0-2.1+deb8u2_armhf.deb;unpack=0;name=deb1\
"
DEBFILENAME_libcairo-gobject2 = "libcairo-gobject2_1.14.0-2.1+deb8u2_armhf.deb"
SRC_URI[deb0.sha256sum] = "68fac7d4b43898e21b55d60ccdc1766db42a94d7784862877d56de8be4140531"
SRC_URI[deb0.md5sum] = "312052bd8c661e639b125c65de2a0c60"
DEBFILENAME_libcairo2 = "libcairo2_1.14.0-2.1+deb8u2_armhf.deb"
SRC_URI[deb1.sha256sum] = "5072e370a1b586ca0a20b6d2d6372ce72e5aaba92a91a0945da1a5a0be6c81cd"
SRC_URI[deb1.md5sum] = "cda710813f49203ac45b45bb8e72de27"

RDEPENDS_lib${PN}-gobject2 = "libc6 (>= 2.4) libcairo2 (>= 1.10.0) libglib2.0-0 (>= 2.14.0)"
RDEPENDS_lib${PN}2 = "libc6 (>= 2.11) libfontconfig1 (>= 2.11) libfreetype6 (>= 2.3.5) libpixman-1-0 (>= 0.30.0) libpng12-0 (>= 1.2.13-4) libx11-6 libxcb-render0 libxcb-shm0 libxcb1 (>= 1.6) libxext6 libxrender1 zlib1g (>= 1:1.1.4)"
DEPENDS = "libxcb1 libx11-6 libxcb-shm0 libxrender1 libpng12-0 libc6 libglib2.0-0 libpixman-1-0 libxext6 libfontconfig1 libfreetype6 libxcb-render0 zlib1g"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_libcairo-gobject2 = " \
    ./usr/lib/arm-linux-gnueabihf/libcairo-gobject.so.2 \
    ./usr/lib/arm-linux-gnueabihf/libcairo-gobject.so.2.11400.0 \
    ./usr/share/doc/libcairo-gobject2/AUTHORS.gz \
    ./usr/share/doc/libcairo-gobject2/NEWS.gz \
    ./usr/share/doc/libcairo-gobject2/README.gz \
    ./usr/share/doc/libcairo-gobject2/changelog.Debian.gz \
    ./usr/share/doc/libcairo-gobject2/changelog.gz \
    ./usr/share/doc/libcairo-gobject2/copyright\
"
FILES_libcairo2 = " \
    ./usr/lib/arm-linux-gnueabihf/libcairo.so.2 \
    ./usr/lib/arm-linux-gnueabihf/libcairo.so.2.11400.0 \
    ./usr/share/doc/libcairo2/AUTHORS.gz \
    ./usr/share/doc/libcairo2/NEWS.gz \
    ./usr/share/doc/libcairo2/README.gz \
    ./usr/share/doc/libcairo2/changelog.Debian.gz \
    ./usr/share/doc/libcairo2/changelog.gz \
    ./usr/share/doc/libcairo2/copyright\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
