PACKAGES = "libcairo-gobject2 libcairo2"
PROVIDES = "libcairo-gobject2 libcairo2"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/c/cairo/libcairo-gobject2_1.12.2-3+deb7u1_armhf.deb;unpack=0;name=deb0\
	http://archive.raspbian.org/raspbian/pool/main/c/cairo/libcairo2_1.12.2-3+deb7u1_armhf.deb;unpack=0;name=deb1\
"
DEBFILENAME_libcairo-gobject2 = "libcairo-gobject2_1.12.2-3+deb7u1_armhf.deb"
SRC_URI[deb0.sha256sum] = "266937837a0bdad0f323157cdc31a8c7c2c4a9d0be5d888315315a807429fa88"
SRC_URI[deb0.md5sum] = "8ded83e3203fc3f79bf28975358dc28e"
DEBFILENAME_libcairo2 = "libcairo2_1.12.2-3+deb7u1_armhf.deb"
SRC_URI[deb1.sha256sum] = "301d8f5b58b252a5b781257d6c9cbd1e1d44c634339e0fced2521cf8530e6645"
SRC_URI[deb1.md5sum] = "51161ba4c782e3605833616da75d9dd2"

RDEPENDS_lib${PN}-gobject2 = "libc6 (>= 2.13-28) libcairo2 (>= 1.10.0) libglib2.0-0 (>= 2.14.0)"
RDEPENDS_lib${PN}2 = "libc6 (>= 2.13-28) libfontconfig1 (>= 2.9.0) libfreetype6 (>= 2.3.5) libgcc1 (>= 1:4.4.0) libpixman-1-0 (>= 0.21.6) libpng12-0 (>= 1.2.13-4) libx11-6 libxcb-render0 libxcb-shm0 libxcb1 (>= 1.6) libxrender1 zlib1g (>= 1:1.1.4)"
DEPENDS = "libglib2.0-0 libgcc1 libx11-6 libxcb1 libpng12-0 libxrender1 libpixman-1-0 zlib1g libfreetype6 libxcb-render0 libc6 libxcb-shm0 libfontconfig1"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_libcairo-gobject2 = " \
	./usr/share/doc/libcairo-gobject2/changelog.gz \
	./usr/share/doc/libcairo-gobject2/copyright \
	./usr/lib/arm-linux-gnueabihf/libcairo-gobject.so.2 \
	./usr/share/doc/libcairo-gobject2/NEWS.gz \
	./usr/share/doc/libcairo-gobject2/README.gz \
	./usr/share/doc/libcairo-gobject2/AUTHORS.gz \
	./usr/lib/arm-linux-gnueabihf/libcairo-gobject.so.2.11200.2 \
	./usr/share/doc/libcairo-gobject2/changelog.Debian.gz\
"
FILES_libcairo2 = " \
	./usr/share/doc/libcairo2/copyright \
	./usr/share/doc/libcairo2/changelog.gz \
	./usr/share/doc/libcairo2/README.gz \
	./usr/lib/arm-linux-gnueabihf/libcairo.so.2 \
	./usr/lib/arm-linux-gnueabihf/libcairo.so.2.11200.2 \
	./usr/share/doc/libcairo2/changelog.Debian.gz \
	./usr/share/doc/libcairo2/AUTHORS.gz \
	./usr/share/doc/libcairo2/NEWS.gz\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
