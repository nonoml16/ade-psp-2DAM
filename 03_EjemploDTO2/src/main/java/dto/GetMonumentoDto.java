package dto;

import lombok.Builder;
import lombok.Value;
import model.Monumento;

@Value
@Builder
public class GetMonumentoDto {

    private Long id;
    private String nombre, localizacion, urlFoto, nombreCategoria;

    public static GetMonumentoDto of (Monumento monumento){
        return GetMonumentoDto.builder()
                .id(monumento.getId())
                .nombre(monumento.getNombre())
                .localizacion(monumento.getLocalizacion())
                .urlFoto(monumento.getUrlFoto())
                .nombreCategoria(
                        monumento.getCategoria().getNombre()
                )
    }
}
