PACKAGES = "libcairo-gobject2 libcairo2"
PROVIDES = "libcairo-gobject2 libcairo2"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/c/cairo/libcairo-gobject2_1.14.0-2.1+deb8u1_armhf.deb;unpack=0;name=deb0\
	http://ftp.de.debian.org/debian/pool/main/c/cairo/libcairo2_1.14.0-2.1+deb8u1_armhf.deb;unpack=0;name=deb1\
"
DEBFILENAME_libcairo-gobject2 = "libcairo-gobject2_1.14.0-2.1+deb8u1_armhf.deb"
SRC_URI[deb0.sha256sum] = "2c1ac03f4d80bc3755e58d0074be0acea1a8ffac9e973d8359c7fa9866e4bf26"
SRC_URI[deb0.md5sum] = "8627063f7e8e7bfb058c2a4964f00b83"
DEBFILENAME_libcairo2 = "libcairo2_1.14.0-2.1+deb8u1_armhf.deb"
SRC_URI[deb1.sha256sum] = "f619a62ab5d3cf03024ee7b01efed95f91eaffda51f42ed3bd1da250ba68c0c2"
SRC_URI[deb1.md5sum] = "b3e22c8678071e9d4c12db0485132cc6"

RDEPENDS_lib${PN}-gobject2 = "libc6 (>= 2.4) libcairo2 (>= 1.10.0) libglib2.0-0 (>= 2.14.0)"
RDEPENDS_lib${PN}2 = "libc6 (>= 2.11) libfontconfig1 (>= 2.11) libfreetype6 (>= 2.3.5) libpixman-1-0 (>= 0.30.0) libpng12-0 (>= 1.2.13-4) libx11-6 libxcb-render0 libxcb-shm0 libxcb1 (>= 1.6) libxext6 libxrender1 zlib1g (>= 1:1.1.4)"
DEPENDS = "libglib2.0-0 libx11-6 zlib1g libxcb1 libpng12-0 libxrender1 libpixman-1-0 libxext6 libfreetype6 libxcb-render0 libc6 libxcb-shm0 libfontconfig1"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_libcairo-gobject2 = " \
	./usr/share/doc/libcairo-gobject2/changelog.gz \
	./usr/share/doc/libcairo-gobject2/copyright \
	./usr/lib/arm-linux-gnueabihf/libcairo-gobject.so.2 \
	./usr/lib/arm-linux-gnueabihf/libcairo-gobject.so.2.11400.0 \
	./usr/share/doc/libcairo-gobject2/NEWS.gz \
	./usr/share/doc/libcairo-gobject2/README.gz \
	./usr/share/doc/libcairo-gobject2/AUTHORS.gz \
	./usr/share/doc/libcairo-gobject2/changelog.Debian.gz\
"
FILES_libcairo2 = " \
	./usr/share/doc/libcairo2/copyright \
	./usr/share/doc/libcairo2/changelog.gz \
	./usr/share/doc/libcairo2/README.gz \
	./usr/lib/arm-linux-gnueabihf/libcairo.so.2 \
	./usr/lib/arm-linux-gnueabihf/libcairo.so.2.11400.0 \
	./usr/share/doc/libcairo2/changelog.Debian.gz \
	./usr/share/doc/libcairo2/AUTHORS.gz \
	./usr/share/doc/libcairo2/NEWS.gz\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
