PACKAGES = "${PN} fontconfig fontconfig-config libfontconfig1"
PROVIDES = "fontconfig fontconfig-config libfontconfig1"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/f/fontconfig/fontconfig_2.13.1-2_armhf.deb;unpack=0;name=deb0\
	http://archive.raspbian.org/raspbian/pool/main/f/fontconfig/fontconfig-config_2.13.1-2_all.deb;unpack=0;name=deb1\
	http://archive.raspbian.org/raspbian/pool/main/f/fontconfig/libfontconfig1_2.13.1-2_armhf.deb;unpack=0;name=deb2\
"
DEBFILENAME_fontconfig = "fontconfig_2.13.1-2_armhf.deb"
SRC_URI[deb0.sha256sum] = "f2d17a9588f37d149e2777bdeb6acbc8bad203b814c8983b34ddee24ce316421"
SRC_URI[deb0.md5sum] = "6f7a7174d3ca147c6d1b43c92b32280a"
DEBFILENAME_fontconfig-config = "fontconfig-config_2.13.1-2_all.deb"
SRC_URI[deb1.sha256sum] = "9f5d34ba20eb156ef62d8126866a376be985c6a83fdcfb33f12cd83acac480c2"
SRC_URI[deb1.md5sum] = "bf030a59aaa40076b77af1cd5037ae2e"
DEBFILENAME_libfontconfig1 = "libfontconfig1_2.13.1-2_armhf.deb"
SRC_URI[deb2.sha256sum] = "3c9b6ab7c53742599ba2d43f67181b01b77442c0bd48539466e3a117c555e094"
SRC_URI[deb2.md5sum] = "df6ccec9dd1b7fb3edd26ad896f8663f"

RDEPENDS_${PN} = "fontconfig-config libc6 (>= 2.4) libfontconfig1 (>= 2.13.0) libfreetype6 (>= 2.2.1)"
RDEPENDS_${PN}-config = "debconf (>= 0.5) fonts-dejavu-core ucf (>= 0.29)"
RDEPENDS_lib${PN}1 = "fontconfig-config (>= 2.13.1-2) libc6 (>= 2.7) libexpat1 (>= 2.0.1) libfreetype6 (>= 2.3.9) libuuid1 (>= 2.16)"
DEPENDS = "debconf fonts-dejavu-core libc6 libexpat1 libfreetype6 libuuid1 ucf"


inherit deb_group

FILES_${PN} = " \
    ./usr/bin/fc-cache \
    ./usr/bin/fc-cat \
    ./usr/bin/fc-conflist \
    ./usr/bin/fc-list \
    ./usr/bin/fc-match \
    ./usr/bin/fc-pattern \
    ./usr/bin/fc-query \
    ./usr/bin/fc-scan \
    ./usr/bin/fc-validate \
    ./usr/share/doc-base/fontconfig-user \
    ./usr/share/doc/fontconfig/README.Debian \
    ./usr/share/doc/fontconfig/changelog.Debian.gz \
    ./usr/share/doc/fontconfig/changelog.gz \
    ./usr/share/doc/fontconfig/copyright \
    ./usr/share/doc/fontconfig/fontconfig-user.html \
    ./usr/share/doc/fontconfig/fontconfig-user.pdf.gz \
    ./usr/share/doc/fontconfig/fontconfig-user.txt.gz \
    ./usr/share/lintian/overrides/fontconfig \
    ./usr/share/man/man1/fc-cache.1.gz \
    ./usr/share/man/man1/fc-cat.1.gz \
    ./usr/share/man/man1/fc-conflist.1.gz \
    ./usr/share/man/man1/fc-list.1.gz \
    ./usr/share/man/man1/fc-match.1.gz \
    ./usr/share/man/man1/fc-pattern.1.gz \
    ./usr/share/man/man1/fc-query.1.gz \
    ./usr/share/man/man1/fc-scan.1.gz \
    ./usr/share/man/man1/fc-validate.1.gz\
"
FILES_fontconfig-config = " \
    ./etc/fonts/conf.d/10-scale-bitmap-fonts.conf \
    ./etc/fonts/conf.d/11-lcdfilter-default.conf \
    ./etc/fonts/conf.d/20-unhint-small-vera.conf \
    ./etc/fonts/conf.d/30-metric-aliases.conf \
    ./etc/fonts/conf.d/40-nonlatin.conf \
    ./etc/fonts/conf.d/45-generic.conf \
    ./etc/fonts/conf.d/45-latin.conf \
    ./etc/fonts/conf.d/49-sansserif.conf \
    ./etc/fonts/conf.d/50-user.conf \
    ./etc/fonts/conf.d/51-local.conf \
    ./etc/fonts/conf.d/60-generic.conf \
    ./etc/fonts/conf.d/60-latin.conf \
    ./etc/fonts/conf.d/65-fonts-persian.conf \
    ./etc/fonts/conf.d/65-nonlatin.conf \
    ./etc/fonts/conf.d/69-unifont.conf \
    ./etc/fonts/conf.d/80-delicious.conf \
    ./etc/fonts/conf.d/90-synthetic.conf \
    ./etc/fonts/conf.d/README \
    ./etc/fonts/fonts.conf \
    ./usr/share/doc/fontconfig-config/NEWS.Debian.gz \
    ./usr/share/doc/fontconfig-config/changelog.Debian.gz \
    ./usr/share/doc/fontconfig-config/changelog.gz \
    ./usr/share/doc/fontconfig-config/copyright \
    ./usr/share/fontconfig/conf.avail/10-autohint.conf \
    ./usr/share/fontconfig/conf.avail/10-hinting-full.conf \
    ./usr/share/fontconfig/conf.avail/10-hinting-medium.conf \
    ./usr/share/fontconfig/conf.avail/10-hinting-none.conf \
    ./usr/share/fontconfig/conf.avail/10-hinting-slight.conf \
    ./usr/share/fontconfig/conf.avail/10-no-sub-pixel.conf \
    ./usr/share/fontconfig/conf.avail/10-scale-bitmap-fonts.conf \
    ./usr/share/fontconfig/conf.avail/10-sub-pixel-bgr.conf \
    ./usr/share/fontconfig/conf.avail/10-sub-pixel-rgb.conf \
    ./usr/share/fontconfig/conf.avail/10-sub-pixel-vbgr.conf \
    ./usr/share/fontconfig/conf.avail/10-sub-pixel-vrgb.conf \
    ./usr/share/fontconfig/conf.avail/10-unhinted.conf \
    ./usr/share/fontconfig/conf.avail/11-lcdfilter-default.conf \
    ./usr/share/fontconfig/conf.avail/11-lcdfilter-legacy.conf \
    ./usr/share/fontconfig/conf.avail/11-lcdfilter-light.conf \
    ./usr/share/fontconfig/conf.avail/20-unhint-small-vera.conf \
    ./usr/share/fontconfig/conf.avail/25-unhint-nonlatin.conf \
    ./usr/share/fontconfig/conf.avail/30-metric-aliases.conf \
    ./usr/share/fontconfig/conf.avail/40-nonlatin.conf \
    ./usr/share/fontconfig/conf.avail/45-generic.conf \
    ./usr/share/fontconfig/conf.avail/45-latin.conf \
    ./usr/share/fontconfig/conf.avail/49-sansserif.conf \
    ./usr/share/fontconfig/conf.avail/50-user.conf \
    ./usr/share/fontconfig/conf.avail/51-local.conf \
    ./usr/share/fontconfig/conf.avail/60-generic.conf \
    ./usr/share/fontconfig/conf.avail/60-latin.conf \
    ./usr/share/fontconfig/conf.avail/65-fonts-persian.conf \
    ./usr/share/fontconfig/conf.avail/65-khmer.conf \
    ./usr/share/fontconfig/conf.avail/65-nonlatin.conf \
    ./usr/share/fontconfig/conf.avail/69-unifont.conf \
    ./usr/share/fontconfig/conf.avail/70-force-bitmaps.conf \
    ./usr/share/fontconfig/conf.avail/70-no-bitmaps.conf \
    ./usr/share/fontconfig/conf.avail/70-yes-bitmaps.conf \
    ./usr/share/fontconfig/conf.avail/80-delicious.conf \
    ./usr/share/fontconfig/conf.avail/90-synthetic.conf \
    ./usr/share/man/man5/fonts-conf.5.gz \
    ./usr/share/xml/fontconfig/fonts.dtd\
"
FILES_libfontconfig1 = " \
    ./usr/lib/arm-linux-gnueabihf/libfontconfig.so.1 \
    ./usr/lib/arm-linux-gnueabihf/libfontconfig.so.1.12.0 \
    ./usr/share/doc/libfontconfig1/changelog.Debian.gz \
    ./usr/share/doc/libfontconfig1/changelog.gz \
    ./usr/share/doc/libfontconfig1/copyright\
"
