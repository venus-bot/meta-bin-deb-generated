PACKAGES = "${PN} libcairo-gobject2 libcairo2"
PROVIDES = "libcairo-gobject2 libcairo2"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/c/cairo/libcairo-gobject2_1.16.0-4_armhf.deb;unpack=0;name=deb0\
	http://archive.raspbian.org/raspbian/pool/main/c/cairo/libcairo2_1.16.0-4_armhf.deb;unpack=0;name=deb1\
"
DEBFILENAME_libcairo-gobject2 = "libcairo-gobject2_1.16.0-4_armhf.deb"
SRC_URI[deb0.sha256sum] = "7b1dbd5c47a019fa540cd5aaf5ae6959c3de09e47b6affda9f36584924267773"
SRC_URI[deb0.md5sum] = "7bd50bd00505680a2edde76c28055759"
DEBFILENAME_libcairo2 = "libcairo2_1.16.0-4_armhf.deb"
SRC_URI[deb1.sha256sum] = "7b33596def024db54c257516c94f58a1a9d981c05a5425ab2e0351209c673a1d"
SRC_URI[deb1.md5sum] = "99129077d8ee0957be06812aef992fbe"

RDEPENDS_lib${PN}-gobject2 = "libcairo2 (>= 1.10.0) libglib2.0-0 (>= 2.14.0)"
RDEPENDS_lib${PN}2 = "libc6 (>= 2.11) libfontconfig1 (>= 2.12.6) libfreetype6 (>= 2.9.1) libpixman-1-0 (>= 0.30.0) libpng16-16 (>= 1.6.2-1) libx11-6 libxcb-render0 libxcb-shm0 libxcb1 (>= 1.6) libxext6 libxrender1 zlib1g (>= 1:1.1.4)"
DEPENDS = "libc6 libfontconfig1 libfreetype6 libglib2.0-0 libpixman-1-0 libpng16-16 libx11-6 libxcb-render0 libxcb-shm0 libxcb1 libxext6 libxrender1 zlib1g"


inherit deb_group

FILES_libcairo-gobject2 = " \
    ./usr/lib/arm-linux-gnueabihf/libcairo-gobject.so.2 \
    ./usr/lib/arm-linux-gnueabihf/libcairo-gobject.so.2.11600.0 \
    ./usr/share/doc/libcairo-gobject2/changelog.Debian.gz \
    ./usr/share/doc/libcairo-gobject2/changelog.gz \
    ./usr/share/doc/libcairo-gobject2/copyright\
"
FILES_libcairo2 = " \
    ./usr/lib/arm-linux-gnueabihf/libcairo.so.2 \
    ./usr/lib/arm-linux-gnueabihf/libcairo.so.2.11600.0 \
    ./usr/share/doc/libcairo2/AUTHORS.gz \
    ./usr/share/doc/libcairo2/NEWS.gz \
    ./usr/share/doc/libcairo2/README.gz \
    ./usr/share/doc/libcairo2/changelog.Debian.gz \
    ./usr/share/doc/libcairo2/changelog.gz \
    ./usr/share/doc/libcairo2/copyright\
"
